package com.hkx.dao;

import com.hkx.entity.Course_section;

public interface Course_sectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_section record);

    int insertSelective(Course_section record);

    Course_section selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_section record);

    int updateByPrimaryKey(Course_section record);
}