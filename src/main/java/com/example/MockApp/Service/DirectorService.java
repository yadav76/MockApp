package com.example.MockApp.Service;

import com.example.MockApp.Model.Director;
import com.example.MockApp.Repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    // Add Director To DB
    public void addDirector(Director director) {
        directorRepository.save(director);
    }

    // find Director by name
    public Director findDirector(String name) {
        return directorRepository.findById(name).get();
    }
}
