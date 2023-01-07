package com.example.MockApp.Repository;

import com.example.MockApp.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
}
