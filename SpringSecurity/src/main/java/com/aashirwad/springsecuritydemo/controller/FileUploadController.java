package com.aashirwad.springsecuritydemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class FileUploadController {

    @GetMapping("/files")
    public List<String> getAllFileNames(){
        return new ArrayList<>();
    }
}
