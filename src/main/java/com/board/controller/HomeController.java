package com.board.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
//초기화 되지 않은 final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성해 줌
@RequiredArgsConstructor
public class HomeController {

    @RequestMapping(value = {"/", ""})
    public String index() {
        log.info("index.jsp");
        return "index";
    }
}
