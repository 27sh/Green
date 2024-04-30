package com.green.junitExam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.junitExam.dao.IUserDao;
import com.green.junitExam.dto.User;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class MyController {
	
	@Autowired
	private IUserDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "main";
	}
	
    @GetMapping("/list")
    public String list(Model model) {
        List<User> userList = dao.getUserList();
        model.addAttribute("list", userList);
        return "list";
    }
    
    @GetMapping("/saveForm")
	public String writeForm() {
		return "saveForm";
	}
	
	@PostMapping("save")
	public String save(User dto) {
		dao.saveUser(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("uno") int uno, Model model) {
		
		model.addAttribute("dto", dao.getUser(uno));
		
		return "detail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("uno") int uno, Model model) {
		
		dao.deleteUser(uno);
		
		return "redirect:list";
	}
}
