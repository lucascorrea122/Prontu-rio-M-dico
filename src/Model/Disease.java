/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public class Disease {
    
    private String name;
    private gravity gravity;
    public List<Diagnosis> diagnosis;

    
            
   enum gravity{
   
        Low,
        Medium,
        Hight
   }         
    
   
   public Disease(String name){
       this.name = name;
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
     * @return the gravity
     */
    public gravity getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(gravity gravity) {
        this.gravity = gravity;
    }
}
