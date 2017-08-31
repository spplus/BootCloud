package com.spplus.dbservice.service;

import com.spplus.bootcm.bean.UserInfo;

public interface UserInfoService {
    // 通过username查找用户信息
    public UserInfo findByUsername(String username);
}