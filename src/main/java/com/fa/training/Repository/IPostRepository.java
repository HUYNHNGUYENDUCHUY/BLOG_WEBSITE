package com.fa.training.Repository;


import com.fa.training.dto.ForUpdate.UPost;
import com.fa.training.dto.List.LiPost;
import com.fa.training.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {

    @Modifying
    @Query("update Post p set p.title=:title ,p.content=:content,p.tags =:tags" +
            ",p.status =:status,p.updateTime =:updateTime where p.id =:id")
    void updateById(@Param("title") String title, @Param("content") String content, @Param("tags") String tags,
                    @Param("status") String status, @Param("updateTime") LocalDateTime updateTime, @Param("id") Long id);

    Post findPostById(Long id);


    @Query("select p from Post p where p.user.id =:id")
    List<LiPost> findAllByAuthorId(@Param("id") Long id);


}
