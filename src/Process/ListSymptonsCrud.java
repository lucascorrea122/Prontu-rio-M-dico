/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.Administrator;
import Model.People;
import Model.Symptom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LucasCorrea
 */
public class ListSymptonsCrud implements ListSymptons{
    
   String name = "Symptons"; 
   private String type;
    
   private List<Symptom> symptons = new ArrayList();

   

    public ListSymptonsCrud(String name) {
        this.name = name;
    }


    public boolean delete(int cod){
        for (Symptom sympton : symptons) {
            if(sympton.getCod()== cod){
                symptons.remove(sympton);
                return true;
            }
        }
        return false;
    }
    
 
    public boolean writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator")
                    +this.name
                    + ".csv"));

            for (Symptom sympton : symptons) {
                bw.write(sympton.writeFile());
            }
            
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public boolean insert(Symptom symptom) {
        symptons.add(symptom);
        return true;
    }

    @Override
    public Symptom consultBtCode(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Symptom consultByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(int cod, Symptom symptom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public boolean readFile() {
        File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + this.name + ".txt");

        if (file.exists()) {
           try {
                readingSymptons();
            } catch (IOException ex) {
                Logger.getLogger(ListSymptonsCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
                        return true;
        }
        return false;
    }

    @Override
    public void readingUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Symptom> getLista() {
        return this.symptons;
    }
 
    
    public void readingSymptons() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + this.name + ".csv"));
        do {
            line = br.readLine();

            if (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ';') {

                        //<editor-fold defaultstate="collapsed" desc="Switch">
                        switch (aux) {
                            case 0:
                                codig = Integer.parseInt(convert);
                                break;
                            case 1:
                                name = convert;
                                break;
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Symptom symptom = new Symptom(name);
                aux = 0;
                this.symptons.add(symptom);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }
    
    
    public void readingAdministrator2() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0, year = 0, id=0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + this.name + ".csv"));

        do {
            line = br.readLine();

            if (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ';') {

                        //<editor-fold defaultstate="collapsed" desc="Switch">
                        switch (aux) {
                            case 0:
                                codig = Integer.parseInt(convert);
                                break;
                            case 1:
                                name = convert;
                                break;
                           
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Symptom symptom = new Symptom(name);
                aux = 0;
                this.symptons.add(symptom);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }

    public void insertStringSymptom(String name){
        
    }
}
