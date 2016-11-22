package com.xuetong.movie.service;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xuetong.movie.dao.FilmLocationDao;
import com.xuetong.movie.domain.FilmLocation;
import com.xuetong.movie.domain.Movie;
import com.xuetong.movie.domain.MovieFilmedRecord;

@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private FilmLocationDao filmLocationDao;

    @Override
    public Set<Movie> getMovieByTitle(String title) throws SQLException {
        List<FilmLocation> filmLocations = filmLocationDao.getFilmLocationByMovieTitle(title);
        return this.locationToMovie(filmLocations);
    }

    @Override
    public Set<Movie> getMovieByTitleFuzzy(String title) throws SQLException {
        List<FilmLocation> filmLocations = filmLocationDao.getFilmLocationsByMovieTitleFuzzy(title);
        return this.locationToMovie(filmLocations);
    }

    @Override
    public Set<MovieFilmedRecord> getMovieFilmedRecord(String title) throws SQLException {
        List<FilmLocation> filmLocations = filmLocationDao.getFilmLocationByMovieTitle(title);
        return this.locationToMovieFilmedRecord(filmLocations);
    }
    
    private Set<Movie> locationToMovie(List <FilmLocation> filmLocations) {
        Set<Movie> movies = new HashSet<Movie>();
        for (FilmLocation filmLocation : filmLocations) {
            Movie movie = new Movie(
                    filmLocation.getTitle(),
                    filmLocation.getReleaseYear(),
                    filmLocation.getProductionCompany(),
                    filmLocation.getDistributor(),
                    filmLocation.getDirector(),
                    filmLocation.getWriter(),
                    filmLocation.getActor1(),
                    filmLocation.getActor2(),
                    filmLocation.getActor3()
                    );
            movies.add(movie);
        }
        return movies;
    }

    private Set<MovieFilmedRecord> locationToMovieFilmedRecord(List <FilmLocation> filmLocations){
        Set<MovieFilmedRecord> movieFilmedRecords = new HashSet<MovieFilmedRecord>();
        for (FilmLocation filmLocation : filmLocations) {
            if (filmLocation.getLocation() == null)
                continue;
            MovieFilmedRecord movieFilmedRecord = new MovieFilmedRecord(
                    filmLocation.getTitle(),
                    filmLocation.getLocation(),
                    filmLocation.getFunFacts()
                    );
            movieFilmedRecords.add(movieFilmedRecord);
        }
        return movieFilmedRecords;
    }
}
