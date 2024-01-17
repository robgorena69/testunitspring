package com.gorena.TestProject.Peliculas.data;

import java.util.List;

import com.gorena.TestProject.Peliculas.model.Genero;
import com.gorena.TestProject.Peliculas.model.Movie;

public class MovieJPARepository implements  MovieRepository {

    @Override
    public Movie findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Movie> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Movie> findByGenero(Genero genero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByGenero'");
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveOrUpdate'");
    }

    @Override
    public List<Movie> findByDuration(int duration) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDuration'");
    }

    
    
}
