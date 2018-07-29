package com.lsl.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 处理请求类
 * @author: liushaoli
 * @create: 2018-07-29 17:40
 */
@RestController
public class Test1Controller {

    /**
     * @api {get} /user/:id Request User information
     * @apiName GetUser
     * @apiGroup User
     * @apiParam {Number} id Users unique ID.
     * @apiSuccess {String} firstname Firstname of the User.
     * @apiSuccess {String} lastname  Lastname of the User.
     */
    @RequestMapping(value = "test")
    public String test(Long id) {
        List list = null;

        return "hello, world";
    }

}
