package com.cfurd.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cfurd.sb.service.CsvService;

@Controller
public class CsvController {

	  @Autowired
	  CsvService fileService;

	  @PostMapping("/upload")
	  public String uploadFile(@RequestParam("file") MultipartFile file) {
     
	        fileService.save(file);
	        return "success";
	    
	  }
}