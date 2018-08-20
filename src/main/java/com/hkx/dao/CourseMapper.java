package com.hkx.dao;

import com.hkx.entity.Course;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKeyWithBLOBs(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> queryAll();

    List<Course> queryByClassify(String classifyName);

    List<Course> queryBySubClassify(String subClassifyName);

    List<Course> queryByName(String name);

    List<Course> queryByUserName(String userName);
}