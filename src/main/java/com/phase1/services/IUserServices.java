package com.phase1.services;
import java.util.List;
import com.phase1.models.User;

public interface IUserServices {
	public boolean addUser(User newUser);
	public List<User> getAllUsers();
}
