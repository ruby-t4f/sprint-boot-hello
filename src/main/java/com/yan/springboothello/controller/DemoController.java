package com.yan.springboothello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * DemoController
 *
 * @author yanwenjie
 * @date 2022/7/22 14:18
 */
@RestController
@RequestMapping("/test")
public class DemoController {
    @GetMapping("/hello")
    public void test(HttpServletRequest httpRequest, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello world !");
    }

}
