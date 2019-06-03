package com.museum.museumServer.main.repository;


import com.museum.museumServer.main.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.io.Serializable;


@CrossOrigin
@Repository
public interface UserRepository extends MongoRepository<User, Serializable>{
    User findByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

    User findByUsername(@Param("username")String username);

}
