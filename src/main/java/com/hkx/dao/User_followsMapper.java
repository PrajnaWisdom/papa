package com.hkx.dao;

import com.hkx.entity.User_follows;

public interface User_followsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_follows record);

    int insertSelective(User_follows record);

    User_follows selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_follows record);

    int updateByPrimaryKey(User_follows record);
}