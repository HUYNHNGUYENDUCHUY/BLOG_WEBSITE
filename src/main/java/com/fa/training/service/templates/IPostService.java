package com.fa.training.service.templates;

import com.fa.training.dto.ForCreate.CPost;
import com.fa.training.dto.ForUpdate.UPost;
import com.fa.training.dto.List.LiPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface IPostService {

    void save(CPost postDto);
    List<LiPost> getAllByAuthorId(Long id);

    UPost getById(Long id);

    void updateById(UPost postDto , Long id);

    void deleteById(Long id);

}
