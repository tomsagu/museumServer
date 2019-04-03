package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BrandRepository extends MongoRepository<Brand, Serializable> {
}
