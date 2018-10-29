package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 * @author Tania Quilachamin
 */
public class Serie {
   private int id; 
    private String title;
    private String genero;
    private String creador;
    private int duration;
    private short year;
    private boolean viwear;
    private int timeviwer;

    public Serie(int id, String title, String genero, String creador, int duration, short year, boolean viwear, int timeviwer) {
        this.id = id;
        this.title = title;
        this.genero = genero;
        this.creador = creador;
        this.duration = duration;
        this.year = year;
        this.viwear = viwear;
        this.timeviwer = timeviwer;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getGenero() {
        return genero;
    }

    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String getCreador() {
        return creador;
    }

    
    public void setCreador(String creador) {
        this.creador = creador;
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

        public boolean isViwear() {
        return viwear;
    }

    
    public void setViwear(boolean viwear) {
        this.viwear = viwear;
    }

    
    public int getTimeviwer() {
        return timeviwer;
    }

    
    public void setTimeviwer(int timeviwer) {
        this.timeviwer = timeviwer;
    }
    
}

