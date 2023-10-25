package com.fa.training.controller;


import com.fa.training.dto.ForLogin.LUser;
import com.fa.training.dto.List.LiPost;
import com.fa.training.entity.User;
import com.fa.training.service.templates.IPostService;
import com.fa.training.service.templates.IUserService;
import com.fa.training.utils.IGetData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private IGetData getData;
    @Autowired
    private IPostService postService;


    @GetMapping(path = "/login")
    public String login(Model theModel){
        theModel.addAttribute("user",new User());
        theModel.addAttribute("choice","Login");
        return "login-page";
    }
    @PostMapping(path = "/login")
    public String login(){
        return "redirect:/user/home";
    }






    @GetMapping(path = "/about")
    public String toAboutPage(Model theModel){
        theModel.addAttribute("choice","about");
        return "about-page";
    }
    @GetMapping(path = "/home")
    public String toHomePage(Model theModel){
       List<LiPost> liPostList = postService.getAllByAuthorId(getData.getUserId());
       theModel.addAttribute("listPost" ,liPostList);
        theModel.addAttribute("choice","");
        return "home-page";
    }
    @GetMapping(path = "/contact")
    public String toContactPage(Model theModel){
        theModel.addAttribute("choice","Contact");
        return "contact-page";
    }



}
