package com.jk.service.impl;

import com.jk.mapper.HotelMapper;
import com.jk.service.HotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 酒店service
 */
@Service
public class HotelServiceImpl implements HotelService {

   @Resource
    private HotelMapper hotelMapper;



}
