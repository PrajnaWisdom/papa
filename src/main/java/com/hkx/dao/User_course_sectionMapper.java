package com.hkx.dao;

import com.hkx.entity.User_course_section;

public interface User_course_sectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_course_section record);

    int insertSelective(User_course_section record);

    User_course_section selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_course_section record);

    int updateByPrimaryKey(User_course_section record);
}