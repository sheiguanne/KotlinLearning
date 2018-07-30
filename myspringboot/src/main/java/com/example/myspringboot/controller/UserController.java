package com.example.myspringboot.controller;

import com.example.myspringboot.model.Outaccount;
import com.example.myspringboot.model.User;
import com.example.myspringboot.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    //打印日志
    private static final Log logger = LogFactory.getLog(UserController.class);



    @RequestMapping(value="/user/login")
    public ModelAndView f(
            ModelAndView mv,
            HttpServletRequest request){
        logger.info("/user/a接口 被调用，请求者的地址是"+request.getRemoteAddr());
        return mv;
    }



    @RequestMapping(value="/user/a")
    @ResponseBody
    public Object a(){
        User u = new User();
        u.setEmail("123@qq.com");
        u.setNickname("三毛");
        return u;
    }


    @RequestMapping(value="/user/saveo")
    @ResponseBody
    public Object so(){
        Outaccount outaccount = new Outaccount();
        outaccount.setTime("2018-12-12 12:12:12");
        outaccount.setUserid(1L);
        outaccount.setMoney(33.3);
        outaccount.setNote("chifan");
        return userService.saveOutaccount(outaccount);
    }
}
