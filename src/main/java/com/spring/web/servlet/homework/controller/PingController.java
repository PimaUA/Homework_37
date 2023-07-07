package com.spring.web.servlet.homework.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.PrintWriter;

@Controller
@ResponseBody
public class PingController {

    @GetMapping("/ping")
    //@ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getPing() {
        //response.addHeader("my header","OK");
        return ResponseEntity.ok("OK");
    }
}
