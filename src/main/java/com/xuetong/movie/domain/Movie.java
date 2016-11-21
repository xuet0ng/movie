package com.xuetong.movie.domain;

public class Movie {
    
    private String title;
    private int releaseYear;
    private String productionCompany;
    private String distributor;
    private String director;
    private String writer;
    private String actor1;
    private String actor2;
    private String actor3;
    
    public Movie () {
        
    }

    public Movie (
            String title, 
            int releaseYear, 
            String productionCompany, 
            String distributor, 
            String director, 
            String writer, 
            String actor1, 
            String actor2, 
            String actor3) 
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((actor1 == null) ? 0 : actor1.hashCode());
        result = prime * result + ((actor2 == null) ? 0 : actor2.hashCode());
        result = prime * result + ((actor3 == null) ? 0 : actor3.hashCode());
        result = prime * result + ((director == null) ? 0 : director.hashCode());
        result = prime * result + ((distributor == null) ? 0 : distributor.hashCode());
        result = prime * result + ((productionCompany == null) ? 0 : productionCompany.hashCode());
        result = prime * result + releaseYear;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((writer == null) ? 0 : writer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (actor1 == null) {
            if (other.actor1 != null)
                return false;
        } else if (!actor1.equals(other.actor1))
            return false;
        if (actor2 == null) {
            if (other.actor2 != null)
                return false;
        } else if (!actor2.equals(other.actor2))
            return false;
        if (actor3 == null) {
            if (other.actor3 != null)
                return false;
        } else if (!actor3.equals(other.actor3))
            return false;
        if (director == null) {
            if (other.director != null)
                return false;
        } else if (!director.equals(other.director))
            return false;
        if (distributor == null) {
            if (other.distributor != null)
                return false;
        } else if (!distributor.equals(other.distributor))
            return false;
        if (productionCompany == null) {
            if (other.productionCompany != null)
                return false;
        } else if (!productionCompany.equals(other.productionCompany))
            return false;
        if (releaseYear != other.releaseYear)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (writer == null) {
            if (other.writer != null)
                return false;
        } else if (!writer.equals(other.writer))
            return false;
        return true;
    }
    

}
