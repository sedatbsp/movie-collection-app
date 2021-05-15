package com.sedatbsp.ozguryazilim.repository;

import com.sedatbsp.ozguryazilim.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findByName(String name);
    List<Movie> findByGenre(String genre);

}
