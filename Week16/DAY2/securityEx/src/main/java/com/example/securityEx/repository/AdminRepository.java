package com.example.securityEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.securityEx.domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
