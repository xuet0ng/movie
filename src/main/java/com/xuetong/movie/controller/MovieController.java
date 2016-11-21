package com.xuetong.movie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xuetong.movie.domain.Movie;
import com.xuetong.movie.domain.MovieFilmedRecord;
import com.xuetong.movie.service.MovieService;

@RestController
@RequestMapping("/movieService/v1")
public class MovieController {

    @Autowired
    private MovieService movieService;
    
    @RequestMapping(value = "/movies/{title}", method = RequestMethod.GET)
    public Set<Movie> getMovie(
            @PathVariable String title, 
            @RequestParam(required=false) String fuzzy) 
    {
        if (fuzzy.equals("yes"))
            return movieService.getMovieByTitleFuzzy(title);
        return movieService.getMovieByTitle(title);
    }
    
    @RequestMapping(value = "/movies/{title}/filmedRecord", method = RequestMethod.GET)
    public Set<MovieFilmedRecord> getMovieFilmedRecord(@PathVariable String title) {
        return movieService.getMovieFilmedRecord(title);
    }
}
