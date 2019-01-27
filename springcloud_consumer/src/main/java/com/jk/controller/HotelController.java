package com.jk.controller;

import com.jk.service.ServiceApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("hotel")
public class HotelController {

    @Resource
    private ServiceApi serviceApi;

    //酒店首页
    @RequestMapping("toHotel")
    public String toHotel(){

        return "hotel";
    }
    //北京 10065
    @RequestMapping("10065")
    public String beijing(){

        return "10065beijing";
    }


}
