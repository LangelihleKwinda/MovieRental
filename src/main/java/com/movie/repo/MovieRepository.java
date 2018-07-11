package com.movie.repo;

import com.movie.model.Movie;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MovieRepository extends Repository {
    
    void delete(Movie movie);

    List findAll();

    Movie findOne(long id);

    Movie save(Movie movie);

    Movie create(Movie movie);

    Movie findById(long id);

    Movie update(Movie user);

    public void delete(long id);
}
