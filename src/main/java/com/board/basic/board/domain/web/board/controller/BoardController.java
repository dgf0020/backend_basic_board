package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @Autowired
    private BoardService bs;

    // 게시판 목록 조회
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();

        mav.addObject("list", bs.getBoard());
        mav.setViewName("home.html");

        return mav;
    }


	// 게시판 상세 조회

	// 게시판 등록
    @GetMapping("/write")
    public String write() {
        return "write.html";
    }

    @PostMapping("/write")
    public ModelAndView write(BoardResponseDto input) {
        ModelAndView mav = new ModelAndView();

        bs.writeBoard(input);
        mav.setViewName("redirect:/");

        return mav;
    }

	// 게시판 수정

	// 게시판 삭제


}
