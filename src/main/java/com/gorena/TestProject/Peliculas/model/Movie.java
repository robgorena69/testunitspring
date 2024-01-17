package com.gorena.TestProject.Peliculas.model;

public class Movie {
    
    private Integer id;
    private String name;
    private String director;
    private Integer minutos;
    private Genero genero;

    public Movie(Integer id, String name, String director, Integer minutos, Genero genero) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.minutos = minutos;
        this.genero = genero;
    }

    public Movie(Integer id, String nombre, Genero accion, int i) {
        this.id = id;
        this.name = nombre;
        this.genero = accion;
        this.minutos = i;

    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    


}
