package common.plugin.authority.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import common.plugin.authority.dmo.UserBasicInfo;

public interface UserBasicInfoMapper extends BaseMapper<UserBasicInfo> {
	/**
	 * 
	 * @param userCode 
	 * @return
	 */
	UserBasicInfo getUserByUserCode (@Param("userCode") String userCode);
	/**
	 * 
	 * @param userMobilePhone
	 * @return
	 */
	UserBasicInfo getUserByUserMobilePhone (@Param("userMobilePhone") String userMobilePhone);
}