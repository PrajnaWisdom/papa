package com.hkx.dao;

import com.hkx.entity.User_collections;

public interface User_collectionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_collections record);

    int insertSelective(User_collections record);

    User_collections selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_collections record);

    int updateByPrimaryKey(User_collections record);
}