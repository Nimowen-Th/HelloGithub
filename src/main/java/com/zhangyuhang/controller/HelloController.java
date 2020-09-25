package com.zhangyuhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: Yuhang Zhang
 * @create: 2020-09-24 22:12
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String test() {
        return "Hello!SrpingBoot";
    }
}
