package com.springboot.studyjunhyeong.service.board;

import com.springboot.studyjunhyeong.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	public boolean createBoard (CreateBoardReqDto createBoardReqDto) throws Exception;
	//public boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
