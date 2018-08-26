package com.hkx.dao;

import com.hkx.entity.Course_classify;

import java.util.List;

public interface Course_classifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_classify record);

    int insertSelective(Course_classify record);

    Course_classify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_classify record);

    int updateByPrimaryKey(Course_classify record);

    List<Course_classify> getAllCourseClassify();
}