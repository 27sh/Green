package com.example.securityEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.securityEx.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

	Member findByUsername(String username);

}
