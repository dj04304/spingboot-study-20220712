package com.springboot.studyjunhyeong.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {
	
	@Autowired
	@Qualifier("t1")
	private TestInteface testInteface1;
	
	@Autowired
	@Qualifier("t2")
	private TestInteface testInteface2;

	@GetMapping("/test1")
	public ResponseEntity<?> test1() {
		testInteface1.a();
		testInteface1.b();
		
		testInteface2.a();
		testInteface2.b();
		return ResponseEntity.ok().body(null);
	}
}
