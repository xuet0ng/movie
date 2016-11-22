package com.xuetong.movie.dao;

import java.sql.SQLException;
import java.util.List;

import com.xuetong.movie.domain.FilmLocation;

public interface FilmLocationDao {

    public List<FilmLocation> getFilmLocationByMovieTitle(String title) throws SQLException;
    public List<FilmLocation> getFilmLocationsByMovieTitleFuzzy(String title) throws SQLException;
    public List<FilmLocation> findAllFilmLocations() throws SQLException;
    
}
