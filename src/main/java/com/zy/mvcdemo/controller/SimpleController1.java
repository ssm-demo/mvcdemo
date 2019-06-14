package com.zy.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zy")
public class SimpleController1
{
    public ModelAndView test1()
    {
        ModelAndView mv= new ModelAndView();
        mv.setViewName("zy");
        return mv;
    }
}
