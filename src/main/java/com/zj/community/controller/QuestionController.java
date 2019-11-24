package com.zj.community.controller;

import com.zj.community.dto.QuestionDTO;
import com.zj.community.mapper.QuestionMapper;
import com.zj.community.model.Question;
import com.zj.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String qusetion(@PathVariable(name = "id")Integer id,
    Model model
    ){
        QuestionDTO questionDTO =questionService.getById(id);
        model.addAttribute("question" ,questionDTO);
        return "question";
    }
}
