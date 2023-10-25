package com.fa.training.Repository;

import com.fa.training.dto.ForLogin.LUser;
import com.fa.training.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository< User ,Long > {

User findByUsername(String username);
List<User> findAllBy();
Boolean existsByUsernameAndPassword(String username ,String password);


}
