package com.example.demo.dao;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Integer> {

    public Admin findById(String id);

    public Admin findByUsername(String username);
}
