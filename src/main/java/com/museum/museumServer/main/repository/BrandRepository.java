package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;


@Repository
public interface BrandRepository extends MongoRepository<Brand, Serializable> {

    List<Brand> findByNameLikeOrTextLike(@Param("word")String word, @Param("word1")String word1);
}
