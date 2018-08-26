package com.hkx.service.impl;

import com.hkx.dao.Course_classifyMapper;
import com.hkx.entity.Course_classify;
import com.hkx.service.CourseClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/20
 * @description:
 * @version: 1.0
 */
@Service
public class CourseClassifyServiceImpl implements CourseClassifyService {
    @Autowired
    Course_classifyMapper course_classifyMapper;

    public boolean add(Course_classify course_classify) {
        return course_classifyMapper.insertSelective(course_classify)>0?true:false;
    }

    public boolean delete(int id) {
        return course_classifyMapper.deleteByPrimaryKey(id)>0?true:false;
    }

    public boolean update(Course_classify course_classify) {
        return course_classifyMapper.updateByPrimaryKeySelective(course_classify)>0?true:false;
    }

    public List<Course_classify> getAllCourseClassify() {
        return null;
    }

    public Course_classify getCourseClassifyById(int id) {
        return course_classifyMapper.selectByPrimaryKey(id);
    }
}
