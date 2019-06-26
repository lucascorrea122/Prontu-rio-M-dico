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
    private int quantidade;
    private MedicineType typeMedicine;
    
    
    public Medicine(String name, int quantidade, MedicineType type){
        this.name = name;
        this.quantidade = quantidade;
        this.typeMedicine = type;
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
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the typeMedicine
     */
    public MedicineType getTypeMedicine() {
        return typeMedicine;
    }

    /**
     * @param typeMedicine the typeMedicine to set
     */
    public void setTypeMedicine(MedicineType typeMedicine) {
        this.typeMedicine = typeMedicine;
    }
    
    
    
    
}
