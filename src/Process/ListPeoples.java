/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.People;
import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public interface ListPeoples {
 
    
    public boolean insert(People person);
    
    public People consultBtCode(int cod);
    
    public People consultByName(String name);
    
    public boolean edit(int cod, People person);
    
    public boolean delete(int cod);
    
    public List<People>sortCode();
    
    public List<People>sortName();
    
    public List<People>sortCosults();
    
    public boolean writeFile();
    
    public boolean readFile();
    
    
    
    
    
            
    
    
    
}
