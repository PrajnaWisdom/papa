package com.hkx.dao;

import com.hkx.entity.Course_classify;

public interface Course_classifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_classify record);

    int insertSelective(Course_classify record);

    Course_classify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_classify record);

    int updateByPrimaryKey(Course_classify record);
}