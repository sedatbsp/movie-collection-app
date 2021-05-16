package com.sedatbsp.ozguryazilim.business.concretes;


import com.sedatbsp.ozguryazilim.business.abstracts.IMovieService;
import com.sedatbsp.ozguryazilim.model.Actor;
import com.sedatbsp.ozguryazilim.model.Movie;
import com.sedatbsp.ozguryazilim.repository.IActorRepository;
import com.sedatbsp.ozguryazilim.repository.IMovieRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieManager implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;
    @Autowired
    private IActorRepository actorRepository;


    @Transactional
    @Override
    public void add(Movie movie) {
        String[] actorsArr = movie.getActors().toArray(String[]::new);
        Actor[] actors = new Actor[actorsArr.length];

        for (int i=0; i<=actorsArr.length-1;i++){
            Actor actor = new Actor();
            actor.setName(actorsArr[i]);
            actors[i] = actor;
        }

        Movie newMovie = new Movie(
                movie.getId(),
                movie.getName(),
                movie.getReleaseYear(),
                movie.getGenre(),
                movie.getDescription(),
                movie.getMedia(),
                movie.getLanguageOption(),
                movie.getActors().toString()

        );
        movieRepository.save(newMovie);
    }


    @Transactional
    @Override
    public void delete(int id) {
        movieRepository.deleteById((long) id);
    }

    @Transactional
    @Override
    public Movie findById(int id) throws NotFoundException {
        if(movieRepository.getOne((long) id) !=null){
            return movieRepository.getOne((long) id);
        }
        throw new NotFoundException("There is no movie for this id : " + id);

    }

    @Transactional
    @Override
    public List<Movie> find(String name, String searchType) {
        if(searchType.equals("movie")){
            return movieRepository.findByName(name);
        }
        return movieRepository.findByGenre(name);
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public List<Actor> getAllActors(String name) {
        return null;
    }

    @Override
    public Page<Movie> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {

        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo-1,pageSize,sort);
        return movieRepository.findAll(pageable);
    }

    @Override
    public List<Movie> getDesc() {
        return null;
    }

    @Override
    public List<Movie> getAsc() {
        return null;
    }
}
