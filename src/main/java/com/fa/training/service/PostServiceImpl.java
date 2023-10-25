package com.fa.training.service;

import com.fa.training.Repository.IPostRepository;
import com.fa.training.dto.ForCreate.CPost;
import com.fa.training.dto.ForUpdate.UPost;
import com.fa.training.dto.List.LiPost;
import com.fa.training.entity.Post;
import com.fa.training.service.templates.IPostService;
import com.fa.training.service.templates.IUserService;
import com.fa.training.utils.IGetData;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements IPostService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IGetData getData;
    @Autowired
    private IUserService userService;
    @Autowired
    private IPostRepository postRepository;

    @Override
    public void save(CPost postDto) {
        LocalDateTime localDateTime = LocalDateTime.now();
        postDto.setCreateDate(localDateTime);
        Post post = modelMapper.map(postDto,Post.class);
        post.setUpdateTime(LocalDateTime.now());
        post.setUser(userService.findByUsername(getData.getUsernameFromContextHolder()));
        postRepository.save(post);
    }

    @Override
    public List<LiPost> getAllByAuthorId(Long id) {
        return postRepository.findAllByAuthorId(id);
    }
    @Override
    public UPost getById(Long id){
        return modelMapper.map(postRepository.findPostById(id),UPost.class);

    }


    @Override
    @Transactional
    public void updateById(UPost postDto, Long id) {
        postRepository.updateById(postDto.getTitle(),postDto.getContent(), postDto.getTags(), postDto.getStatus(),LocalDateTime.now(),id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
}
