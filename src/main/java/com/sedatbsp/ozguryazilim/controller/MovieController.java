package com.sedatbsp.ozguryazilim.controller;

import com.sedatbsp.ozguryazilim.model.Movie;
import com.sedatbsp.ozguryazilim.business.abstracts.IMovieService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @GetMapping("/movie")
    public String homePage(Model model) {
        return findPaginated(1,model,"name","asc");

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

    @GetMapping(value = "/view")
    public String searchMovie(Model model,@RequestParam String search, @RequestParam String searchType){
        List<Movie> movies = movieService.find(search,searchType);
        model.addAttribute("movies",movies);
        return "/view";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,Model model,
            @RequestParam("sortField") String sortField,@RequestParam("sortDir") String sortDir){
        int pageSize=5;
        Page<Movie> page = movieService.findPaginated(pageNo,pageSize,sortField,sortDir);
        List<Movie> listMovies = page.getContent();

        model.addAttribute("currentPage",pageNo);
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("totalItems",page.getTotalElements());

        model.addAttribute("sortField",sortField);
        model.addAttribute("sortDir",sortDir);
        model.addAttribute("reverseSortDir",sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listMovies",listMovies);
        return "/movies";

    }


}
