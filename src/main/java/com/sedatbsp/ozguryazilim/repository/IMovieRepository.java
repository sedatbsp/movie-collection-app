package com.sedatbsp.ozguryazilim.repository;

import com.sedatbsp.ozguryazilim.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Long> {

    @Query(value = "select * from movie m where m.name like %:keyword% or m.name_of_actors like %:keyword% or m.genre like %:keyword% ",nativeQuery = true)
    List<Movie> findByName(@Param("keyword") String keyword);
    List<Movie> findByGenre(String genre);

}
