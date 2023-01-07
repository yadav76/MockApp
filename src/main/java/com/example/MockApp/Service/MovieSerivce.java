package com.example.MockApp.Service;

import com.example.MockApp.Model.Director;
import com.example.MockApp.Model.Movie;
import com.example.MockApp.Repository.DirectorRepository;
import com.example.MockApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieSerivce {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    DirectorRepository directorRepository;

    // Function to add Movie to Db
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }


    // Find Movie by name
    public Movie findMovie(String movieName) {

        return movieRepository.findById(movieName).get();
    }

}
