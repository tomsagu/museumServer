package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

@CrossOrigin
@Repository
public interface BrandRepository extends MongoRepository<Brand, Serializable> {
}
