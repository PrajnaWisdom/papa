package com.hkx.service.impl;

import com.hkx.dao.CourseMapper;
import com.hkx.entity.Course;
import com.hkx.service.CourseService;
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
public class courseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;
    public boolean add(Course course) {
        return courseMapper.insertSelective(course)>0?true:false;
    }

    public boolean delete(int id) {
        return courseMapper.deleteByPrimaryKey(id)>0?true:false;
    }

    public boolean update(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course)>0?true:false;
    }

    public Course queryById(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    public List<Course> queryAll() {
        return null;
    }

    public List<Course> queryByClassify(String classifyName) {
        return null;
    }

    public List<Course> queryBySubClassify(String subClassifyName) {
        return null;
    }

    public List<Course> queryByName(String name) {
        return null;
    }

    public List<Course> queryByUserName(String userName) {
        return null;
    }
}
