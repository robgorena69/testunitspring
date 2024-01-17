package com.gorena.TestProject.Peliculas.servicio;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hibernate.mapping.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import com.gorena.TestProject.Peliculas.data.MovieJPARepository;
import com.gorena.TestProject.Peliculas.data.MovieRepository;
import com.gorena.TestProject.Peliculas.model.Genero;
import com.gorena.TestProject.Peliculas.model.Movie;
import com.gorena.TestProject.Peliculas.repository.MovieRepositoryJDB;

import jakarta.activation.DataSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;
import java.util.Arrays;    

public class MovieServiceTest {

    @Autowired
    MovieJPARepository movieRepository;

    @Autowired
    MovieRepositoryJDB movieRepositoryJDB;

    MovieService movieService = new MovieService(); 

    @BeforeEach
    void setup(){
        MovieJPARepository movieRepository = Mockito.mock(MovieJPARepository.class);   
        Mockito.when(movieRepository.findAll())
        .thenReturn(Arrays.asList(new Movie(1,"The Hangover",Genero.COMEDIA,140),
                                                         new Movie(2,"The Hangover 2",Genero.COMEDIA,152),
                                                         new Movie(3,"The Hangover 3",Genero.COMEDIA,164),
                                                         new Movie(4,"Batman Begins",Genero.ACCION,140),
                                                         new Movie(5,"Batman Dark Knight",Genero.ACCION,152),
                                                         new Movie(6,"Batman Dark Knight Rises",Genero.ACCION,164),
                                                         new Movie(7,"Exorcist",Genero.HORROR,140),
                                                         new Movie(8,"The Shining",Genero.HORROR,152),
                                                         new Movie(9,"The Conjuring",Genero.HORROR,164),
                                                         new Movie(10,"The Ring",Genero.HORROR,164)    
                                                         ));
            
          movieService.setMovieRepository(movieRepository);                                                 
    }

    @Test
    void findMoviesByGenereAction(){
            

           /*  Mockito.when(movieRepository.findByGenero(Genero.ACCION))
                .thenReturn(Arrays.asList(new Movie(1L,"Batman Begins",Genero.ACCION,140),
                                                                 new Movie(2L,"Batman Dark Knight",Genero.ACCION,152),
                                                               new Movie(3L,"Batman Dark Knight Rises",Genero.ACCION,164)));
*/
           // MovieService movieService = new MovieService(); 
          //  movieService.setMovieRepository(movieRepository);
            List<Movie> pelis = movieService.findMoviesByGenere(Genero.ACCION); 
            List<Integer> pelisIds = pelis.stream().map(peli->peli.getId()).collect(java.util.stream.Collectors.toList());


            assertEquals(Arrays.asList(4,5,6), pelisIds);
            //assertTrue(null != pelis);

    }   

    @Test
    void findMoviesGeneroComedy(){
        /*
            MovieJPARepository movieRepository = Mockito.mock(MovieJPARepository.class);   

            Mockito.when(movieRepository.findByGenero(Genero.COMEDIA))
                .thenReturn(Arrays.asList(new Movie(1L,"The Hangover",Genero.COMEDIA,140),
                                                                 new Movie(2L,"The Hangover 2",Genero.COMEDIA,152),
                                                                 new Movie(3L,"The Hangover 3",Genero.COMEDIA,164)));
*/
            
            List<Movie> pelis = movieService.findMoviesByGenere(Genero.COMEDIA); 
            assertTrue(null != pelis);
    }

    @Test
    void findMoiesByDuration(){
            //MovieJPARepository movieRepository = Mockito.mock(MovieJPARepository.class);   

           

            //MovieService movieService = new MovieService(); 
            //movieService.setMovieRepository(movieRepository);
            List<Movie> pelis = movieService.findMoviesByDuration(150); 
            List<Integer> pelisIds = pelis.stream().map(peli->peli.getId()).collect(java.util.stream.Collectors.toList());


            assertEquals(pelisIds, Arrays.asList(1,4,7));
    }


    
}
