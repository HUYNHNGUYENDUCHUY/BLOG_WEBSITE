package com.fa.training.service;

import com.fa.training.Repository.IUserRepository;
import com.fa.training.dto.ForLogin.LUser;
import com.fa.training.entity.User;
import com.fa.training.service.templates.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<LUser> getAll() {
        return null ;
    }

    @Override
    public Boolean existsByUsernameAndPassword(String username, String password) {
        String password1 = bCryptPasswordEncoder.encode(password);
        return userRepository.existsByUsernameAndPassword(username,password1);
    }
}
