package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Userentity;

public interface UserRespository extends JpaRepository<Userentity, Long>{

}
