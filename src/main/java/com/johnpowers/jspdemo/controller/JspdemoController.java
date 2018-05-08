package com.johnpowers.jspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspdemoController {
    @RequestMapping("/")
	public String index1() {
	    return "index.jsp";
	}
}
