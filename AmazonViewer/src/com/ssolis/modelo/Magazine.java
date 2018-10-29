package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 * @author Tania Quilachamin
 */
public class Magazine {
   
  int id,edition,editionDate;
  short year;
  boolean viewed;
  String title;
  
  public Magazine(int id,short year, boolean viewed, int edition, int editionDate, String title) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.viewed = viewed;
        this.edition = edition;
        this.editionDate = editionDate;
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

    public int isEdition(){
        return edition;
    }
    
    public void setEdition( int edition){
        this.edition = edition;
    }
    
    public int isEditionDate() {
        return editionDate;
    }
    
    public void setEditionDate(int editionDate) {
        this.editionDate = editionDate;
    }
    

}
