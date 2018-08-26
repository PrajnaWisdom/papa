package com.hkx.controller;

import com.hkx.entity.UserInfo;
import com.hkx.service.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @auther:houkexin
 * @date: 2018/8/17
 * @description: 用户controller
 * @version: 1.0
 */
@Controller
public class LogingController {
    @Autowired
    private LoginRegisterService loginRegisterService;

    /**
     *  获取所有用户
     * @param model
     * @return
     */
    @RequestMapping("/userlist")
    @ResponseBody
    public List<UserInfo> getUsers(Model model){
        List<UserInfo> userInfoList = loginRegisterService.getAllUsers();
        return userInfoList;
    }

    /**
     * 登录验证
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/dologin")
    @ResponseBody
    public boolean verifylogin(String username, String password, HttpSession session){
        UserInfo userInfo = loginRegisterService.verifylogin(username, password);
        if (userInfo != null){
            session.setAttribute("userinfo",userInfo);
          return true;
        }else {
            return false;
        }
    }

    /**
     * 注册
     * @param userInfo
     * @param model
     * @return
     */
    @RequestMapping("/doregister")
    @ResponseBody
    public boolean register(UserInfo userInfo, Model model){
        return loginRegisterService.register(userInfo);
    }

    /**
     * 用户更新
     * @param userInfo
     * @param session
     * @return
     */
    @RequestMapping("/userupdate")
    @ResponseBody
    public boolean update(UserInfo userInfo, HttpSession session){
        userInfo.setId(((UserInfo)session.getAttribute("userinfo")).getId());
        System.out.println(userInfo);
        if (loginRegisterService.update(userInfo)){
            session.setAttribute("userinfo",userInfo);
            return true;
        }else {
            return false;
        }
    }

    /**
     * 用户名验证
     * @param username
     * @param type
     * @return
     */
    @RequestMapping("/verifyname")
    @ResponseBody
    public boolean verifyname(String username, String type){
        if ("login".equals(type)){
            return loginRegisterService.verifyname(username);
        }else {
            return !(loginRegisterService.verifyname(username));
        }
    }

    /**
     * 验证码验证
     * @param code
     * @param session
     * @return
     */
    @RequestMapping("/verifycode")
    @ResponseBody
    public boolean verifycode(String code, HttpSession session){
        String sessioncode = (String) session.getAttribute("code");
        return sessioncode.equals(code);
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("userinfo");
        System.out.println("退出");
        return "index";
    }

    @RequestMapping("/user")
    @ResponseBody
    public UserInfo getUser(HttpSession session){
        System.out.println((UserInfo)session.getAttribute("userinfo"));
        return (UserInfo) session.getAttribute("userinfo");
    }

    @RequestMapping("/updatepwd")
    @ResponseBody
    public int updatePwd(HttpSession session, String oldPwd, String newPwd){
        UserInfo userInfo = (UserInfo)session.getAttribute("userinfo");
        if (userInfo.getPassword().equals(oldPwd)){
            userInfo.setPassword(newPwd);
            if(loginRegisterService.update(userInfo)){
                session.setAttribute("userinfo",userInfo);
                return 1;
            }else {
                userInfo.setPassword(oldPwd);
                session.setAttribute("userinfo",userInfo);
                return 0;
            }
        }else {
            return -1;
        }
    }

    @RequestMapping("/uploadimg")
    public void uploadHead(MultipartFile file, HttpSession session) throws IOException {
        String filename = file.getOriginalFilename();
        String extensName = filename.substring(filename.lastIndexOf(".")+1);
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "")+"."+extensName;
        System.out.println(newFileName);
        file.transferTo(new File("D:/UpImagePic/upload"+File.separator+newFileName));
        UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");
        userInfo.setHeader("/upload/"+newFileName);
        if(loginRegisterService.update(userInfo)){
            session.setAttribute("userinfo",userInfo);
        }
    }
}
