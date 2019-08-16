package common.plugin.authority.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import common.plugin.authority.dmo.InterfacePermission;

public interface InterfacePermissionMapper extends BaseMapper<InterfacePermission>{
	/**
	 * 
	 * @param roleList
	 * @return
	 */
	List<InterfacePermission> getPermissionInfosByRoles(@Param("roleList") Set<String> roleList);
}