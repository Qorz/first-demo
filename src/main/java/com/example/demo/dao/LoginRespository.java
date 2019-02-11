package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Userentity;

public interface LoginRespository extends JpaRepository<Userentity, Long>{
//	 @Query(value = "SELECT * FROM tab_register WHERE  cellphone=?1 AND psd=?2 ", nativeQuery = true)
		public Userentity findByNameAndPassword(String name,String password);
}
