package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;


@Repository
public interface DocumentRepository extends MongoRepository<Document, Serializable>{


    List<Document> findByNameLikeIgnoreCaseOrTextLikeIgnoreCase(@Param("word")String word, @Param("word1")String word1);

}
