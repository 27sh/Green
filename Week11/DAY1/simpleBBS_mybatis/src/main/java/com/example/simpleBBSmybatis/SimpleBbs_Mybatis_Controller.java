package com.example.simpleBBSmybatis;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.simpleBBSmybatis.dao.ISimpleBBSDao;

@Controller
public class SimpleBbs_Mybatis_Controller {
	
	@Autowired
	private ISimpleBBSDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.listDao());
		return "list"; 
	}
	
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto", dao.viewDao(sId));
		
		
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(Model model, HttpServletRequest request) {
		dao.writeDao(request.getParameter("writer"), request.getParameter("title"), request.getParameter("content"));
		
		return "redirect";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		dao.deleteDao(request.getParameter("id"));
		
		
		return "redirect:list";
	}
	
	
	
	
}
