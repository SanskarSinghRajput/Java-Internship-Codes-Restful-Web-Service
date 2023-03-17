package com.springrestapi.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/home")
    public webservice test(){
		return new webservice("Sanskar Singh","Chaudhary Charan Singh University ","Btech","Computer Science","JAVA Intern At Hackveda","Developing a Restful Web Service");
	}
}
