package com.vesus.springbootlog.controller;

import com.alibaba.fastjson.JSONObject;
import com.vesus.springbootlog.util.LoggerUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/login")
    public JSONObject login(HttpServletRequest request , String name) throws Exception{
        JSONObject obj = new JSONObject();
        obj.put("msg","用户："+name+"，登录成功。");
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        return obj;
    }
}
