package com.hkx.service.impl;

import com.hkx.dao.UserInfoMapper;
import com.hkx.entity.UserInfo;
import com.hkx.service.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/17
 * @description:
 * @version: 1.0
 */
@Service
public class LoginRegisterServiceImpl implements LoginRegisterService {
    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> getAllUsers() {
        return userInfoMapper.getAllUsers();
    }

    public UserInfo getUserInfoById(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public UserInfo verifylogin(String username, String password){
        return userInfoMapper.verifylogin(username,password);
    }

    public boolean register(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo)>0? true:false;
    }

    public boolean update(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo)>0?true:false;
    }

    public boolean verifyname(String username) {
        return userInfoMapper.verifyname(username) != null?true:false;
    }
}
