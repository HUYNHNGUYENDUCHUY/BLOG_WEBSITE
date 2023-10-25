package com.fa.training;


import com.fa.training.Repository.IPostRepository;
import com.fa.training.Repository.IRoleRepository;
import com.fa.training.Repository.IUserRepository;
import com.fa.training.entity.Post;
import com.fa.training.entity.Role;
import com.fa.training.entity.User;
import com.fa.training.entity.enums.ERole;
import com.fa.training.service.templates.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.HashSet;

@SpringBootApplication
public class SpringBootJpaSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaSecurityApplication.class, args);
    }

//    @Autowired
//    private IRoleRepository roleRepository;
//
//    @Autowired
//    private IUserRepository userRepository;
//
//    @Autowired
//    private IPostRepository postRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
////        Role roleUser = new Role(ERole.USER);
////        Role roleAdmin = new Role(ERole.ADMIN);
////        roleRepository.save(roleUser);
////        roleRepository.save(roleAdmin);
//        Post post = new Post(Long.parseLong("1"),"A Test Post","This blog system is developed using Yil . It is meant to demonstrate This\n" +
//                "                            blog system is developed using Yil . It is meant to demonstrate This blog system is\n" +
//                "                            It is meant to demonstrat","test","This blog system is developed using Yil . It is meant to demonstrate This\n" +
//                "                            blog system is developed using Yil ", LocalDateTime.now(),LocalDateTime.now());
//        User user = new User("huynguyen",bCryptPasswordEncoder.encode("huynguyen"));
//        user.setRoles(new HashSet<>(roleRepository.findByName(ERole.ADMIN)));
//        userRepository.save(user);

//postRepository.save(post);
    }

}
