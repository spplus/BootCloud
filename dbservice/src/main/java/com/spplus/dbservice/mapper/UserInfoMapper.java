package com.spplus.dbservice.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.spplus.bootcm.bean.UserInfo;


@Mapper
public interface UserInfoMapper {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}