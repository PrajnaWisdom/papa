package com.hkx.service;

import com.hkx.entity.Course;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/20
 * @description:
 * @version: 1.0
 */
public interface CourseService {
    boolean add(Course course);
    boolean delete(int id);
    boolean update(Course course);
    Course queryById(int id);
    List<Course> queryAll();
    List<Course> queryByClassify(String classifyName);
    List<Course> queryBySubClassify(String subClassifyName);
    List<Course> queryByName(String name);
    List<Course> queryByUserName(String userName);
}
