package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.entity.repository.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDAO dao;

    public List<BoardResponseDto> getBoard() {
        return dao.selectAll();
    }

    public int writeBoard(BoardResponseDto input) {
        return dao.writeBoard(input);
    }

    // 게시판 목록 조회


	// 게시판 상세 조회

	// 게시판 등록

	// 게시판 수정

	// 게시판 삭제
}
