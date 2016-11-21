package com.xuetong.movie.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.xuetong.movie.domain.FilmLocation;


@Component
public class FilmLocationDaoImpl implements FilmLocationDao{

    @Value("${soda.url}")
    private String sodaBaseUrl;
    
    private RestTemplate restTemplate = new RestTemplate();
    
    @Override
    public List<FilmLocation> getFilmLocationByMovieTitle(String title) {
        String query = "?title=" + title;
        String url = this.sodaBaseUrl + query;
        return this.queryFilmLocations(url);
    }
    
    @Override
    public List<FilmLocation> getFilmLocationsByMovieTitleFuzzy(String title) {
        String query = "?$where=title like '" + title + "%'";
        String url = this.sodaBaseUrl + query;
        return this.queryFilmLocations(url);

    }
    
    @Override
    public List<FilmLocation> findAllFilmLocations() {
        return this.queryFilmLocations(this.sodaBaseUrl);
    }
    
    private List<FilmLocation> queryFilmLocations(String url) {
        String context = restTemplate.getForObject(url, String.class);
        return JSONObject.parseArray(context, FilmLocation.class);
    }
}
