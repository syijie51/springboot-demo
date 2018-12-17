package com.syj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    @RequestMapping("/index")
    public String index(){
        System.out.print("come in..............");
        return "login";
    }


    /**
     * 用户登陆方法
     */
    @RequestMapping("/login")
    public String login(@RequestParam(value="username") String username, @RequestParam(value="pwd") String pwd, HttpServletRequest request, HttpServletResponse response){
            System.out.println("用户名为:"+username+"--》密码为:"+pwd);
          /*  HttpSession session=request.getSession();
            session.setAttribute("username",username);
            session.setAttribute("pwd",pwd);*/
            /* ModelAndView model=new ModelAndView();
             model.addObject("username",username);
             model.addObject("pwd",pwd);*/
            request.setAttribute("username",username);
            request.setAttribute("pwd",pwd);
            return "success";
    }


}
