package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-06-09 16:53
 */
@RestController
public class HelloController {

    @RequestMapping("info1")
    public String info(){
        return "hello springboot info  项目经理写的";
    }

    @RequestMapping("info2")
    public String developor(){
        return "hello develepor";
    }

    @RequestMapping("info3")
    public String developor01(){
        return "hello develepor";
    }


    //悄悄写一点东西

    //开发老哥又悄悄地写了一点东西


    //开发老哥又又又又写了一点东西
}
