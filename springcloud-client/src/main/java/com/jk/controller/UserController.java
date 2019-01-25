/**
 * Copyright (C),2018
 * FileName: 段国强
 * Author:   admin
 * Date:     2019/1/25 14:56
 * Description:
 * History:
 */
package com.jk.controller;

import com.jk.service.ExtractService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2019/1/25
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("test")
    public void test(@RequestParam("id")Integer id){
        System.out.println("这是测试传来的id:"+id);
    }


}
