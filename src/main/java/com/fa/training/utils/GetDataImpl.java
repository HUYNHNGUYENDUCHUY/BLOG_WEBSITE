package com.fa.training.utils;


import com.fa.training.service.UserServiceImpl;
import com.fa.training.service.templates.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDataImpl implements IGetData {
    @Autowired
    private IUserService userService;



    @Override
    public String getUsernameFromContextHolder() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        String  username = authentication.getName();
        return username;
    }

    @Override
    public Long getUserId() {
        return  userService.findByUsername(getUsernameFromContextHolder()).getId();
    }

    @Override
    public String[] getListOptionStatus() {
        String[] list = {"Draft","message","new","novel"};

        return list;
    }
}
