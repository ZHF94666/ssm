package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhf
 * @ClassName EmployeeController
 * @Description TODO
 * @Date 2021/11/2 21:45
 **/
@Controller
public class EmployeeController {

    @RequestMapping(value = {"/","index.html"})
    public String index(){
        return "index";
    }
}
