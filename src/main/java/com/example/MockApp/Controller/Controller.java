package com.example.MockApp.Controller;

import com.example.MockApp.Model.Director;
import com.example.MockApp.Model.Movie;
import com.example.MockApp.Service.DirectorService;
import com.example.MockApp.Service.MovieSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    DirectorService directorService;

    @Autowired
    MovieSerivce movieSerivce;

    // API for getting movie
    @GetMapping("/findmoive")
    public Movie findMovie(String name) {
        return movieSerivce.findMovie(name);
    }

    // API for adding Movie
    @PostMapping("/addmovie")
    public void addMovie(Movie movie) {
        movieSerivce.addMovie(movie);
    }

    // API for getting Director
    @GetMapping("/finddirector")
    public Director findDirector(String director) {
        return directorService.findDirector(director);
    }

    // API for Adding Director
    @PostMapping("/adddirector")
    public void addDirector(Director director) {
        directorService.addDirector(director);
    }
}
