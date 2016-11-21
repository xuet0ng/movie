package com.xuetong.movie.service;

import java.util.Set;

import com.xuetong.movie.domain.Movie;
import com.xuetong.movie.domain.MovieFilmedRecord;

public interface MovieService {
    
    public Set<Movie> getMovieByTitle(String title);
    public Set<Movie> getMovieByTitleFuzzy(String title);
    public Set<MovieFilmedRecord> getMovieFilmedRecord(String title);
}
