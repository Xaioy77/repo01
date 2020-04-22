package com.java.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/order")//防止重名
public class ControllerDemo2 {
	//这个只能接受post请求
	@RequestMapping(value="{hello.do,h.do,aa.do}",method=RequestMethod.POST)
	public void  test1(){
		System.out.println("hello SpringMVC");
	}
	@RequestMapping(value="test2.do")
	public void  test2(){
		System.out.println("oreder");
	}
}
