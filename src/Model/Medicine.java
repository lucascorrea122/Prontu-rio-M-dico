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
public class Medicine {
    
    private String name; 
    //private MedicineType typeMedicine;
    private String type;
    
    public Medicine(String name){
        this.name = name;
        
    }

     public String writeFile() {
           String string = getName()+";\n";
           return string;
     }
     
      public String toString() {
           String string = getName();
           return string;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}
