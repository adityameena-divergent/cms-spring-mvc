package com.divergentsl.cms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms.dao.AdminDao;
import com.divergentsl.cms.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Transactional
	public boolean login(String username, String password) {
		
		Admin admin = adminDao.login(username);
		
		return username.equals(admin.getUsername()) && password.equals(admin.getPassword());
		
	}

}
