package com.xuetong.movie.dao;

import java.util.List;

import com.xuetong.movie.domain.FilmLocation;

public interface FilmLocationDao {

    public List<FilmLocation> getFilmLocationByMovieTitle(String title);
    public List<FilmLocation> getFilmLocationsByMovieTitleFuzzy(String title);
    public List<FilmLocation> findAllFilmLocations();
    
}
