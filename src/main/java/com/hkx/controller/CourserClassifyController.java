package com.hkx.controller;

import com.hkx.entity.Course_classify;
import com.hkx.service.CourseClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther:houkexin
 * @date: 2018/8/20
 * @description:
 * @version: 1.0
 */
@Controller
public class CourserClassifyController {
    @Autowired
    private CourseClassifyService courseClassifyService;

    @RequestMapping("/addCourseClassify")
    @ResponseBody
    public boolean addCourseClassify(Course_classify course_classify){
        return courseClassifyService.add(course_classify);
    }

    @RequestMapping("/deleteCourseClassify")
    @ResponseBody
    public boolean deleteCourseClassify(int id){
        return courseClassifyService.delete(id);
    }

    @RequestMapping("/updateCourseClassify")
    @ResponseBody
    public boolean update(Course_classify course_classify){
        return courseClassifyService.update(course_classify);
    }

    @RequestMapping("/getCourseClassifyById")
    @ResponseBody
    public Course_classify getCouserClassify(int id){
        return courseClassifyService.getCourseClassifyById(id);
    }

    @RequestMapping("/getAllCourseClassify")
    @ResponseBody
    public List<Course_classify> getAllCourseClassify(){
        return courseClassifyService.getAllCourseClassify();
    }
}
