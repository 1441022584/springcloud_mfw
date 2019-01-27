/**
 * Copyright (C),2018
 * FileName: 段国强
 * Author:   admin
 * Date:     2019/1/25 15:00
 * Description:
 * History:
 */
package com.jk.controller;

import com.jk.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private ServiceApi serviceApi;


    @RequestMapping("test")
    public void test(Integer id){

        serviceApi.test(id);
    }



}
