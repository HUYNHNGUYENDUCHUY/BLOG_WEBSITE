package com.fa.training.service.templates;


import com.fa.training.dto.ForLogin.LUser;
import com.fa.training.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {

	User findByUsername(String username);
	List<LUser> getAll();
	Boolean existsByUsernameAndPassword(String username,String password);
}
