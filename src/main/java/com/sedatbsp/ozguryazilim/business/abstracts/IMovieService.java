package com.sedatbsp.ozguryazilim.business.abstracts;

import com.sedatbsp.ozguryazilim.model.Actor;
import com.sedatbsp.ozguryazilim.model.Movie;
import javassist.NotFoundException;

import java.util.List;

public interface IMovieService {

    void add(Movie movie);
    void delete(int movie);
    Movie findById(int id) throws NotFoundException;
    Movie getMovieByName(String name) throws NotFoundException;



    List<Movie> find (String name, String searchType);
    List<Movie> getAll();
    List<Actor> getAllActors();

    List<Movie> getDesc();
    List<Movie> getAsc();


}
