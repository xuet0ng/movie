package com.xuetong.movie.domain;

public class MovieFilmedRecord {
    
    private String title;
    private String location;
    private String funFacts;
    
    public MovieFilmedRecord(String title, String location, String funFacts) {
        this.title = title;
        this.location = location;
        this.funFacts = funFacts;
    }
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFunFacts() {
        return funFacts;
    }
    public void setFunFacts(String funFacts) {
        this.funFacts = funFacts;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((funFacts == null) ? 0 : funFacts.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
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
        MovieFilmedRecord other = (MovieFilmedRecord) obj;
        if (funFacts == null) {
            if (other.funFacts != null)
                return false;
        } else if (!funFacts.equals(other.funFacts))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
    
}
