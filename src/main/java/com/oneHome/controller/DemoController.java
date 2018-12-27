/**
 * Copyright (C), 2018, 中电福富信息科技有限公司
 * FileName: DemoController
 * Author:   xujiajun
 * Date:     2018/12/27 16:27
 */
package com.oneHome.controller;

import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Description: 
 * @Author xujiajun
 * @Date 2018/12/27  16:27
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * 日志
     */
    private static final  Logger logger = Logger.getLogger(DemoController.class);

    @PostMapping("/test.do")
    public String demoTest(){
        return "success";
    }

}