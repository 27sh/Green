package com.example.securityEx.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.securityEx.domain.Member;
import com.example.securityEx.repository.MemberRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		
		Member member = memberRepository.findByUsername(username);
		
		if(member != null) {
			return new CustomUserDetails(member);
		}
		return null;
	}
	
}
