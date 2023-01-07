package com.example.MockApp.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Director {

    @Id
    @Column(name="Director_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="movieDirector")
    @JsonIgnore
    Movie movie;   // There is one Director for many movies
}
