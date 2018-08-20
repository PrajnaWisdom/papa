package com.hkx.controller;

/**
 * @auther:houkexin
 * @date: 2018/8/19
 * @description:
 * @version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 页面跳转
 */
@Controller
public class UrlController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/home")
    public String home(HttpSession session){
        if (session.getAttribute("userinfo") != null) {
            return "home";
        }else {
            return "index";
        }
    }
    @RequestMapping("/list")
    public String courselist(){
        return "list";
    }

    @RequestMapping("/course")
    public String course(){
        return "course";
    }
    @RequestMapping("/collect")
    public String collect(){
        return "collect";
    }
    @RequestMapping("/info")
    public String info(){
        return "info";
    }
    @RequestMapping("/passwd")
    public String passwd(){
        return "passwd";
    }
}
