package com.gorena.TestProject.Peliculas.data;



import com.gorena.TestProject.Peliculas.model.Genero;
import com.gorena.TestProject.Peliculas.model.Movie;
import java.util.List;  

public interface MovieRepository {

    Movie findById(Long id);    
    List<Movie> findAll();
    List<Movie> findByGenero(Genero genero);
    List<Movie> findByDuration(int duration);
    void saveOrUpdate(Movie movie); 

        
    
}
