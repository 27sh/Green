package com.example.securityEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.securityEx.Dto.MemberDto;
import com.example.securityEx.domain.Member;
import com.example.securityEx.repository.MemberRepository;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Log4j2
@Controller
public class MyController {
	
	@Autowired
	private MemberRepository memberrepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping("/")
	public String root() {
		log.info("root...................");
		
		return "index.html";
	}
	
	@RequestMapping("/registForm")
	public String registForm() {
		log.info("registFrom..........");
		return "registForm";
	}
	
	@RequestMapping("/registForm")
	public @ResponseBody String registProc(MemberDto memberDto) {
		log.info("registProc...." + memberDto);
		
		Member member = new Member();
		member.setUsername(memberDto.getUsername());
		
		String newPw = bCryptPasswordEncoder.encode(memberDto.getPassword());
		member.setPassword(newPw);
		member.setName(memberDto.getName());
		member.setRole("ROLE_MEMBER");
		
		memberrepository.save(member);
		
		return "회원가입 완료됨";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
}
