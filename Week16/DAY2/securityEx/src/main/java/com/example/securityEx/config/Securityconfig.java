package com.example.securityEx.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Securityconfig {
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() throws Exception{
		
		return new BCryptPasswordEncoder();	
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((auth) -> auth
				.requestMatchers("/", "/registForm", "/registProc").permitAll()
				.requestMatchers("/members/**").hasAnyRole("ADMIN","MEMBER")
				.requestMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated()
				//비회원 기능은 인증 절차 x 허용하겠음 얘 외의 다른 애들은 인증을 걸쳐야 한다
				);
		
		http.formLogin((auth) -> auth
					.loginPage("/login") //로그인 폼 지정 - 쓰지 않으면 Spring Security가 제공하는 로그인 폼 사용
					.loginProcessingUrl("/loginProc") //실제 로그인을 처리하는 요청 주소 < 시큐에서 처리해줌 안만들어도 o
					.defaultSuccessUrl("/success")
					.permitAll()
					);
		
		http.csrf(AbstractHttpConfigurer::disable); // csrf기능 끄기
		
		return http.build();
	}
}
