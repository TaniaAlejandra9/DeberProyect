package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 * @author Tania Quilachamin
 */
public class Film {
    
    private String title;
    private String genere;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
        
        
public Film(String title, String genere, String creator, int duration, short yea, boolean viewed) {
       
        this.title = title;
        this.genere = genere;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
       
    }

       public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getGenere() {
        return genere;
    }

    
    public void setGenere(String genero) {
        this.genere = genere;
    }

    
    public String getCreator() {
        return creator;
    }

    
    public void setCreator(String creador) {
        this.creator = creador;
    }

   
    public int getDuration() {
        return duration;
    }

    
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    public short getYear() {
        return year;
    }

    
    public void setYear(short year) {
        this.year = year;
    }

    
    public boolean isViewed() {
        return viewed;
    }

    
    public void setViewed(boolean viwear) {
        this.viewed = viewed;
    }

}
