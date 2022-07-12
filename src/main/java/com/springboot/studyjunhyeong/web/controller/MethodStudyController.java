package com.springboot.studyjunhyeong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MethodStudyController {
	
	@GetMapping({"/", "/index"}) // "/" 또는 "index"로 들어가게끔 설정 getMapping ->  get요청이다.
	public String getMethod() {
		return "method/get"; //method 폴더의 get 파일을 찾아감
	}
	
	@GetMapping("/test")
	public String getMethod2() {
		return "method/test"; //method 폴더의 test 파일을 찾아감
	}
	
}
