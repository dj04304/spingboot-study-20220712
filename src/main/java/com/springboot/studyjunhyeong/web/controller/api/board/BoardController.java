package com.springboot.studyjunhyeong.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjunhyeong.service.board.BoardService;
import com.springboot.studyjunhyeong.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController	
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;

	//게시글 작성
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto) { //변수명이 같으면 생략이 가능하다.
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData); //서비스에서 잘못이 났으면 서버 잘못이기 때문에 internalServerError(500)에러를 출력
		}
		return ResponseEntity.ok().body(responseData);
//		return new ResponseEntity<>(title + "게시글 작성 성공", headers, HttpStatus.BAD_REQUEST);
	}
	
	//게시글 조회
	
	//게시글 수정
	
	//게시글 삭제
	
}
