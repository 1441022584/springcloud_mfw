/**
 * Copyright (C),2018
 * FileName: 段国强
 * Author:   admin
 * Date:     2019/1/25 14:51
 * Description:
 * History:
 */
package com.jk.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2019/1/25
 * @since 1.0.0
 */
public interface ExtractService {


    @RequestMapping(value = "test",method = RequestMethod.GET)
    void test(@RequestParam("id")Integer id);


}
