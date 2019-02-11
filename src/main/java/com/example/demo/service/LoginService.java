package com.example.demo.service;

import com.example.demo.entity.Userentity;

public interface LoginService {
	public Userentity loginUser(String name,String password);
}
