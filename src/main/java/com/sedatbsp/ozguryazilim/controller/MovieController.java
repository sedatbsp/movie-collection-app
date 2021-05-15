package com.sedatbsp.ozguryazilim.controller;

import com.sedatbsp.ozguryazilim.model.Movie;
import com.sedatbsp.ozguryazilim.business.abstracts.IMovieService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {

    private IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("movie", new Movie());
        return "insert";

    }

    @GetMapping("/movies")
    public String getAll(Model model) {
        List<Movie> movies = movieService.getAll();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @PostMapping(value = "/add")
    public String insert(@ModelAttribute("movie") Movie movie) {

        movieService.add(movie);
        return "redirect:/movies";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute("movie") Movie movie) {

        movieService.add(movie);
        return "redirect:/movies?updated";
    }

    @GetMapping(value = "/movie/delete/{id}")
    public String delete(Model model, @PathVariable("id") Integer id) {
        movieService.delete(id);
        return "redirect:/movies?deleted";

    }

    @GetMapping(value = "/movie/view/{id}")
    public String viewMovie(Model model, @PathVariable("id") Integer id) throws NotFoundException {
        Movie movies = movieService.findById(id);
        model.addAttribute("movies", movies);
        return "view";
    }

    @GetMapping(value = "/movie/update/{id}")
    public String updateMovie(Model model, @PathVariable("id") Integer id) throws NotFoundException {
        Movie movie = movieService.findById(id);
        model.addAttribute("movie", movie);
        return "update";
    }


}
