/**
 * Copyright (C),2018
 * FileName: 段国强
 * Author:   admin
 * Date:     2019/1/25 14:34
 * Description:
 * History:
 */
package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2019/1/25
 * @since 1.0.0
 */
@FeignClient(value = "service-mfw")  // 调用生产者服务名称
public interface ServiceApi extends ExtractService{





}
