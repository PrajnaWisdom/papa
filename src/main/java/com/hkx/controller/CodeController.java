package com.hkx.controller;

import com.hkx.util.CodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * @auther:houkexin
 * @date: 2018/8/19
 * @description:
 * @version: 1.0
 */
@Controller
public class CodeController {

    @RequestMapping("/getCode")
    public void getCode(HttpServletResponse response, HttpSession session){
        Map<String, Object> map = CodeUtil.generateCodeAndPic();
        session.setAttribute("code",map.get("code"));
        try {
            ImageIO.write((RenderedImage) map.get("codePic"),"jpeg",response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
