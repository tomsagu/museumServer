package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Piece;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PieceRepository extends MongoRepository<Piece, Serializable> {
}
