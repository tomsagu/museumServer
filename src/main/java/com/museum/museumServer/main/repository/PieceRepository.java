package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Piece;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;

@CrossOrigin
@Repository
public interface PieceRepository extends MongoRepository<Piece, Serializable> {


List<Piece> findByName(@Param("name")String name, Pageable pageable);

List<Piece> findByTypesContains(@Param("types")String[] types);

List<Piece> findByRoom(@Param("room")String room);

List<Piece> findByYearBetween(@Param("minyear")String minyear, @Param("maxyear")String maxyear);

List<Piece> findByBrand(@Param("brandname")String brandname);

List<Piece> findByYearBetweenAndTypesContainsAndBrandLike(@Param("minyear")String minyear, @Param("maxyear")String maxyear,@Param("types")String[] types,@Param("brandname")String brandname);

List<Piece> findByYearBetweenAndTypesContains(@Param("minyear")String minyear, @Param("maxyear")String maxyear,@Param("types")String[] types);

List<Piece> findByYearBetweenAndBrandLike(@Param("minyear")String minyear, @Param("maxyear")String maxyear,@Param("brandname")String brandname);

List<Piece> findByNameLikeIgnoreCaseOrTextLikeIgnoreCase(@Param("word")String word, @Param("word1")String word1);


}
