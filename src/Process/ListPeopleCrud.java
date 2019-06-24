/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.People;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public class ListPeopleCrud implements ListPeoples {
    
    private List<People> persons = new ArrayList();
    private String type;
    
    public ListPeopleCrud(String type){
        this.type = type;  
    }
    

    @Override
    public boolean insert(People person) {
        persons.add(person);
        return true;
    }

    @Override
    public People consultBtCode(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public People consultByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(int cod, People person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int cod) {
        for (People person : persons) {
            if(person.getCod() == cod){
                persons.remove(person);
                return true;
            }
            
        }
        return false;
    }

    @Override
    public List<People> sortCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<People> sortName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<People> sortCosults() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean readFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
