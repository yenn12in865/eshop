package com.eshop.we.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wangzhanguo
 * @create 2018-06-05 10:54
 **/
@RestController
public class UserController extends  BaseController{

    @RequestMapping("list")
    public Map<String,Object> list(){
        return new HashMap<String,Object>(){{
            put("name","网站");
        }};
    }

}
