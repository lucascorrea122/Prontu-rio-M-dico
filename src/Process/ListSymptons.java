/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.People;
import Model.Symptom;
import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public interface ListSymptons {
    
    public boolean insert(Symptom symptom);
    
    public Symptom consultBtCode(int cod);
    
    public Symptom consultByName(String name);
    
    public boolean edit(int cod, Symptom symptom);
    
    public boolean delete(int cod);
    
    public List<People>sortCode();
    
    public List<People>sortName();
    
    public List<People>sortCosults();
    
    public boolean writeFile();
    
    public boolean readFile();
    
    public void readingUsers();
    
    
    
}
