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
public class Doctor extends People {

    public Doctor(String name, int year, int id) {
        super(name, year, id);
    }

    @Override
    public String writeFile() {
        String writeFile = super.getCod()+";"+super.getName()+";"+super.getYear()+";\n";
        return writeFile;    
    }
    
    
    @Override
    public String toString(){
        String dados = super.getCod()+" - "+super.getName()+" - Doctor";
        return dados;
    }
    
}
