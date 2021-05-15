package com.sedatbsp.ozguryazilim.business.abstracts;

import com.sedatbsp.ozguryazilim.model.Actor;
import com.sedatbsp.ozguryazilim.model.Movie;
import javassist.NotFoundException;

import java.util.List;

public interface IMovieService {

    void add(Movie movie);
    void update(Movie movie);
    void delete(int movie);
    Movie findById(int id) throws NotFoundException;

    List<Movie> find (String name, String searchType);
    List<Movie> getAll();
    List<Actor> getAllActors(String name);


}
