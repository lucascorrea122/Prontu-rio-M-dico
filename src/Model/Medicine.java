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
    private String typeMedicine;
    private String type;
    
    public Medicine(String name, String type){
        this.name = name;
        this.typeMedicine = type;
        
    }

     public String writeFile() {
           String string = getName()+";"+getTypeMedicine()+";\n";
           return string;
     }
     
      public String toString() {
           String string = getName()+" - "+getTypeMedicine();
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

    /**
     * @return the typeMedicine
     */
    public String getTypeMedicine() {
        return typeMedicine;
    }

    /**
     * @param typeMedicine the typeMedicine to set
     */
    public void setTypeMedicine(String typeMedicine) {
        this.typeMedicine = typeMedicine;
    }
    
    
    
    
}
