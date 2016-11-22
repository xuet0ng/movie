package com.xuetong.movie.service;

import java.sql.SQLException;
import java.util.Set;

import com.xuetong.movie.domain.Movie;
import com.xuetong.movie.domain.MovieFilmedRecord;

public interface MovieService {
    
    public Set<Movie> getMovieByTitle(String title) throws SQLException;
    public Set<Movie> getMovieByTitleFuzzy(String title) throws SQLException;
    public Set<MovieFilmedRecord> getMovieFilmedRecord(String title) throws SQLException;
}
