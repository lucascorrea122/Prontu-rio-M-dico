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
public class Symptom {
    
    private String name;
    private static int code = 1;
    private int cod;
    
    public Symptom(String name){
        this.name = name;
        this.cod= code++;
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
     * @return the cod
     */
    public int getCod() {
        return cod;
    }
    
    
  
    public String writeFile() {
        String writeFile = getCod()+";"+getName()+";\n";
        return writeFile;    
    }
    
    
     @Override
    public String toString(){
        String dados = getCod()+" - "+getName();
        return dados;
    }
    
}
