package com.hkx.service;

import com.hkx.entity.Course_classify;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/20
 * @description:
 * @version: 1.0
 */
public interface CourseClassifyService {
    boolean add(Course_classify course_classify);
    boolean delete(int id);
    boolean update(Course_classify course_classify);
    List<Course_classify> getAllCourseClassify();
    Course_classify getCourseClassifyById(int id);
}
