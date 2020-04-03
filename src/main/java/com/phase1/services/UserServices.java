package com.phase1.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.phase1.models.User;
import com.phase1.repository.IUserRepository;

@Service
public class UserServices implements IUserServices{

	@Autowired
	private IUserRepository repo;
	
	@Override
	public boolean addUser(User newUser) {
		// TODO Auto-generated method stub
		repo.save(newUser);
		
		return true;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Iterable<User> usersIter= repo.findAll();
		List<User> all= new ArrayList<User>();
		for(User user: usersIter)
			all.add(user);
		
		return all;
	}

}
