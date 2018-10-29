package com.ssolis.modelo;
/**
  * @Instituto Rumiñahui
 * @author SSolis
 * @author Tania Quilachamin
 */
public class Book {
  
  int id,duration,timeViewed;
  short year;
  boolean viewed;
  String title;

    public Book(int id, int duration, int timeViewed, String title,short year, boolean viewed) {
        this.id = id;
        this.timeViewed = timeViewed;
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
       
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

    
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    
    public int getTimeViewed(){
        return timeViewed;
    }
    
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

}
