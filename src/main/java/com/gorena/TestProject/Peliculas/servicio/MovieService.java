package com.gorena.TestProject.Peliculas.servicio;

import com.gorena.TestProject.Peliculas.data.MovieRepository;
import com.gorena.TestProject.Peliculas.model.Genero;
import com.gorena.TestProject.Peliculas.model.Movie;    
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findMoviesByGenere(Genero genero) {
        return movieRepository.findAll().stream().filter(movie -> movie.getGenero().equals(genero)).collect(java.util.stream.Collectors.toList());
     }

     public List<Movie> findMoviesByDuration(Integer duration){
        return movieRepository.findAll().stream().filter(movie -> movie.getMinutos().intValue()<=duration.intValue()).collect(java.util.stream.Collectors.toList());
     }
    public MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    

     
}
