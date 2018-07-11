package com.movie.movieImplementation;

import com.movie.model.Movie;
import com.movie.repo.MovieRepository;
import com.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImplem implements MovieService{

    @Autowired
    private MovieRepository repository;

    public Movie create(Movie movie) {
        return repository.save(movie);
    }

    public Movie delete(int id) {
        Movie movie = findById(id);
        if(movie != null){
            repository.delete(movie);
        }
        return movie;
    }

    public List findAll() {
        return repository.findAll();
    }

    public Movie findById(int id) {
        return repository.findOne(id);
    }

    public Movie update(Movie movie) {
        return null;
    }
}
