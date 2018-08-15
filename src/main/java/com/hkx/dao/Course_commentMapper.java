package com.hkx.dao;

import com.hkx.entity.Course_comment;

public interface Course_commentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_comment record);

    int insertSelective(Course_comment record);

    Course_comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_comment record);

    int updateByPrimaryKey(Course_comment record);
}