package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import groovy.util.logging.Slf4j;

@Controller
@Slf4j
public class LogoutController {
	
	/**ユーザー一覧画面にリダイレクト*/
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
}