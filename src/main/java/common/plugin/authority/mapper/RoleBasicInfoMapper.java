package common.plugin.authority.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import common.plugin.authority.dmo.RoleBasicInfo;


public interface RoleBasicInfoMapper  extends BaseMapper<RoleBasicInfo>{
	/**
	 * 
	 * @param userCode
	 * @return
	 */
	List<RoleBasicInfo> getRolesByUserCode(@Param("userCode") String userCode);
}