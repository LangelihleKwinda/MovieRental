package com.movie.controller;

import com.movie.model.Movie;
import com.movie.repo.MovieRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class MovieController {

    private MovieRepository movieRepository;

    @PostMapping
    public Movie create(@RequestBody Movie movie){
        return movieRepository.create(movie);
    }

    @GetMapping(path = {"/{id}"},  produces= MediaType.APPLICATION_JSON_VALUE)
    public Movie findOne(@PathVariable("id") int id){
        return movieRepository.findById(id);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie){
        return movieRepository.update(movie);
    }

    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable("id") long id) {
        movieRepository.delete(id);
    }

    @GetMapping
    public List findAll(){
        return movieRepository.findAll();
    }
}
