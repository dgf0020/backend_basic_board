package com.board.basic.board.domain.web.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "hello!!";
    }
	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록

	// 게시판 수정

	// 게시판 삭제


}
