package com.example.demo.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginRespository;
import com.example.demo.entity.Userentity;
import com.example.demo.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
		@Autowired
		LoginRespository loginRespository;
		@Override
		public Userentity loginUser(String name,String password) {
			return loginRespository.findByNameAndPassword(name, password);
		}
		
}
