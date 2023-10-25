package com.fa.training.controller;



import com.fa.training.dto.ForCreate.CPost;
import com.fa.training.dto.ForUpdate.UPost;
import com.fa.training.entity.Post;
import com.fa.training.service.templates.IPostService;
import com.fa.training.utils.IGetData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/post")
public class PostController {
    @Autowired
    private IPostService postService;
    @Autowired
    private IGetData getData;

    @GetMapping(path = "/create")
    public String create(Model theModel){
        theModel.addAttribute("post", new Post());
        theModel.addAttribute("statusOption",getData.getListOptionStatus());
        theModel.addAttribute("choice","Create Post");
        return "create-post";
    }
    @PostMapping(path = "/create")
    public String add(@ModelAttribute("post") CPost postDto){
        postService.save(postDto);
        return "redirect:/user/home";
    }
    @GetMapping(path = "/update/{id}")
    public String update(Model theModel, @PathVariable (name = "id")Long id){
        theModel.addAttribute("post",postService.getById(id));
        theModel.addAttribute("statusOption",getData.getListOptionStatus());
        theModel.addAttribute("check","true");
        theModel.addAttribute("choice","Update post");
        return "create-post";
    }
    @PostMapping(path = "/update")
    public String update(@ModelAttribute ("Post")UPost postDto){
        postService.updateById(postDto,postDto.getId());
        return "redirect:/user/home";

    }
    @GetMapping(path = "/list")
    public String list(Model theModel){
        theModel.addAttribute("posts",postService.getAllByAuthorId(getData.getUserId()));
        theModel.addAttribute("choice","Manage Post");
        return "manage-post";
    }
    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable("id")Long id){
        postService.deleteById(id);
        return "redirect:/post/list";
    }
    @GetMapping(path = "/view/{id}")
    public String view(Model theModel,@PathVariable("id")Long id){
        theModel.addAttribute("post",postService.getById(id));
        theModel.addAttribute("statusOption",getData.getListOptionStatus());
        theModel.addAttribute("choice","view post");
        return "create-post";
    }



}
