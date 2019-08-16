 package common.plugin.authority.config.support;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;

import common.plugin.authority.dmo.InterfacePermission;
import common.plugin.authority.dmo.RoleBasicInfo;
import common.plugin.authority.dmo.UserBasicInfo;
import common.plugin.authority.mapper.InterfacePermissionMapper;
import common.plugin.authority.mapper.RoleBasicInfoMapper;
import common.plugin.authority.mapper.UserBasicInfoMapper;

 @Service
 public class JdbcUserDetail implements UserDetailsService {
	
	@Autowired
	private UserBasicInfoMapper userBasicInfoMapper;
	@Autowired
	private RoleBasicInfoMapper roleBasicInfoMapper;
	@Autowired
	private InterfacePermissionMapper interfacePermissionMapper;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	 UserBasicInfo userBasicInfo = null;
    	 if (StringUtils.isBlank(username)) {
    		 return null;
    	 }else {
    		 userBasicInfo = userBasicInfoMapper.getUserByUserCode(username);
    	 }
    	 Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
    	 if (userBasicInfo != null) {
    		 
    		 List<RoleBasicInfo> roleList =  roleBasicInfoMapper.getRolesByUserCode(username);
    		 Set<String> roleCodeSet = new HashSet<String>();
    		 if (!CollectionUtils.isEmpty(roleList)) {
    			 for(RoleBasicInfo roleBasicInfo: roleList) {
    				 GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(roleBasicInfo.getRoleName());
    				 roleCodeSet.add(roleBasicInfo.getRoleCode());
    				 grantedAuthorities.add(grantedAuthority);
    			 }
    		 }
    		 if (!CollectionUtils.isEmpty(roleCodeSet)) {
    			 List<InterfacePermission>  permissionList =  interfacePermissionMapper.getPermissionInfosByRoles(roleCodeSet);
    			 for (InterfacePermission interfacePermission : permissionList) {
    				 GrantedAuthority authority = new SimpleGrantedAuthority(JSON.toJSONString(interfacePermission));
    		         grantedAuthorities.add(authority);
    			 }
    		 }
    		 userBasicInfo.setGrantedAuthorities(grantedAuthorities);
    	 }
    	 return userBasicInfo;
    }
}
