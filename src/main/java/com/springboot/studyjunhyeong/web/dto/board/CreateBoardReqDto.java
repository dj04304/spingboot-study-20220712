package com.springboot.studyjunhyeong.web.dto.board;

import com.springboot.studyjunhyeong.domain.board.Board;

import lombok.Data;

/*
 *	객체로 생성하여 key값을 받아온다. 
 */

@Data
public class CreateBoardReqDto {
	private String title;
	private int usercode;
	private String content;
	
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}
}
