package com.spring.web.servlet.homework.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PingController {

    @RequestMapping("/ping")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void getPing(HttpServletResponse response) {
        response.addHeader("my header","OK");
    }
}
