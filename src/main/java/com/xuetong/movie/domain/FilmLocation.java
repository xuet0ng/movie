package com.xuetong.movie.domain;


import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmLocation {
       
    @JSONField(name = "title")
    private String title;
    
    @JSONField(name = "release_year")
    private int releaseYear;
    
    @JSONField(name = "production_company")
    private String productionCompany;
    
    @JSONField(name = "distributor")
    private String distributor;
    
    @JSONField(name = "director")
    private String director;
    
    @JSONField(name = "writer")
    private String writer;
    
    @JSONField(name = "actor_1")
    private String actor1;
    
    @JSONField(name = "actor_2")
    private String actor2;
    
    @JSONField(name = "actor_3")
    private String actor3;
    
    @JSONField(name = "locations")
    private String location;
    
    @JSONField(name = "fun_facts")
    private String funFacts;
    
    public FilmLocation () {
        
    }
    
    @JSONCreator
    public FilmLocation (
            @JsonProperty("title") String title, 
            @JsonProperty("release_year") int releaseYear, 
            @JsonProperty("production_company") String productionCompany, 
            @JsonProperty("distributor") String distributor, 
            @JsonProperty("director") String director, 
            @JsonProperty("writer") String writer, 
            @JsonProperty("actor_1") String actor1, 
            @JsonProperty("actor_2") String actor2, 
            @JsonProperty("actor_3") String actor3, 
            @JsonProperty("locations") String locations,
            @JsonProperty("fun_facts") String funFacts) 
    {
        this.title = title;
        this.releaseYear = releaseYear;
        this.productionCompany = productionCompany;
        this.distributor = distributor;
        this.director = director;
        this.writer = writer;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        this.location = locations;
        this.funFacts = funFacts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFunFacts() {
        return funFacts;
    }

    public void setFunFacts(String funFacts) {
        this.funFacts = funFacts;
    }
}
