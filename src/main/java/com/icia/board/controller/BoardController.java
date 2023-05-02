package com.icia.board.controller;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;
import com.mysql.cj.util.DnsSrv;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor

public class BoardController {
    @Autowired
    private BoardService boardService;
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping ("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        int saveResult =boardService.save(boardDTO);
        if(saveResult > 0 ){
            return "redirect:/";
        }else{
            return "save";
        }
    }
}
