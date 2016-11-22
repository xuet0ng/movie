package com.xuetong.movie.dao;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.xuetong.movie.domain.FilmLocation;

@Component
public class FilmLocationDaoImpl implements FilmLocationDao{
    
    private static final Logger logger = LoggerFactory.getLogger(FilmLocationDao.class);

    @Value("${soda.url}")
    private String sodaBaseUrl;
    
    private RestTemplate restTemplate = new RestTemplate();
    
    @Override
    public List<FilmLocation> getFilmLocationByMovieTitle(String title) throws SQLException {
        String query = "?title=" + title;
        String url = this.sodaBaseUrl + query;
        return this.queryFilmLocations(url);
    }
    
    @Override
    public List<FilmLocation> getFilmLocationsByMovieTitleFuzzy(String title) throws SQLException {
        String query = "?$where=title like '" + title + "%'";
        String url = this.sodaBaseUrl + query;
        return this.queryFilmLocations(url);

    }
    
    @Override
    public List<FilmLocation> findAllFilmLocations() throws SQLException {
        return this.queryFilmLocations(this.sodaBaseUrl);
    }
    
    private List<FilmLocation> queryFilmLocations(String url) throws SQLException {
        try {
            String context = restTemplate.getForObject(url, String.class);
            return JSONObject.parseArray(context, FilmLocation.class);
        } catch (RestClientException ex) {
            logger.error(ex.toString());
            logger.error(ex.getMessage());
            throw new SQLException("Can not access db");
        }
    }
}
