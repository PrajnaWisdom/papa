package com.hkx.service;

import com.hkx.entity.UserInfo;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/17
 * @description:
 * @version: 1.0
 */
public interface LoginRegisterService {
    List<UserInfo> getAllUsers();
    UserInfo getUserInfoById(int id);
    UserInfo verifylogin(String username, String password);
    boolean register(UserInfo userInfo);
    boolean update(UserInfo userInfo);
    boolean verifyname(String username);
}
