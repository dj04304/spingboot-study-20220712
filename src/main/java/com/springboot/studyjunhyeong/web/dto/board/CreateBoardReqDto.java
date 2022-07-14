package com.springboot.studyjunhyeong.web.dto.board;

import lombok.Data;

/*
 *	객체로 생성하여 key값을 받아온다. 
 */

@Data
public class CreateBoardReqDto {
	private String title;
	private int usercode;
	private String content;
}
