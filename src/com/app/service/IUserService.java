package com.app.service;

import com.app.model.User;

public interface IUserService {

	public int saveUser(User user);

	public User getUserByEmailandPwd(String email, String pwd);
}
