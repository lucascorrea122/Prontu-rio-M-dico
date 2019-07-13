/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LucasCorrea
 */
public abstract class People {
  
private String name;
private int year;
private static int code = 1;
private int cod;
private int id;


    
public People(String name, int year, int id){
    this.name = name;
    this.year = year;
    this.cod = code++;
    this.id = id;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     *
     * @return
     */
    public abstract String writeFile();

    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    


    
}
