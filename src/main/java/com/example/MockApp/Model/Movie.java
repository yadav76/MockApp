package com.example.MockApp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="movieDirector")
    Director director;   // There Could be many movies of Same Director
}
