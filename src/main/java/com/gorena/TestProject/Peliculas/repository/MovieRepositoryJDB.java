package com.gorena.TestProject.Peliculas.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gorena.TestProject.Peliculas.data.MovieRepository;
import com.gorena.TestProject.Peliculas.model.Genero;
import com.gorena.TestProject.Peliculas.model.Movie;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


public class MovieRepositoryJDB implements MovieRepository  {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Movie findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }



        @Override
        public List<Movie> findAll() {
          
           return jdbcTemplate.query("select * from movies", new RowMapper<Movie>() {
               public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
                   Movie movie = new Movie();
                     movie.setId(rs.getInt("id"));
                     movie.setName(rs.getString("name"));
                     movie.setGenero(Genero.valueOf(rs.getString("genero")));
                     movie.setMinutos(rs.getInt(rowNum));    
                   return movie;
               }
           });

        }

        @Override
        public List<Movie> findByGenero(Genero genero) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'findByGenero'");
        }

    @Override
    public List<Movie> findByDuration(int duration) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDuration'");
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveOrUpdate'");
    }



    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }



    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   

    
}
