package com.spring.web.servlet.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("<h1>OK</h1>");
    }
}
