/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.Administrator;
import Model.Patient;
import Model.People;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public class ListPatientsCrud implements ListPeoples {

    String name = "Patients";

    private List<Patient> patients = new ArrayList();

    public ListPatientsCrud(String name) {
        this.name = name;
    }

    @Override
    public boolean insert(People person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        for (Patient patient : patients) {
            if(patient.getCod() == cod){
                patients.remove(patient);
                return true;
            }
        }
       return false;
    
    }
    
    public Patient detais(int cod){
        for (Patient patient : patients) {
           if(patient.getCod()==cod){
               return patient;
           } 
        }
        return null;
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator")
                    + this.name + ".csv"));

            for (Patient patient : patients) {
                bw.write(patient.writeFile());
            }
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }

    }

    @Override
    public boolean readFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readingUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(Patient patiente) {
        patients.add(patiente);
    }

    public void readingPatients() throws FileNotFoundException, IOException {
        String name = "", nationale = "", adress = "", numberAdress = "", line, convert = "";
        int codig = 0, aux = 0, year = 0, id = 0;
        long phone = 0;

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
                            case 2:
                                year = Integer.parseInt(convert);
                                break;
                            case 3:
                                phone = Long.parseLong(convert);
                                break;
                            case 4:
                                adress = convert;
                                break;
                            case 5:
                                numberAdress = convert;
                                break;
                            case 6:
                                nationale = convert;
                                break;
                        }
                        //</editor-fold>
                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }
                }
                Patient patient = new Patient(name, year, phone, adress, numberAdress, nationale);
                aux = 0;
                this.patients.add(patient);
                aux = 0;
            }
        } while (line != null);
        br.close();
    }

    /**
     *
     * @param cod
     * @return
     */
    public Patient consultByCode(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Patient> getLista() {
        return this.patients;
    }
    
    public Patient consult(int cod){
        int meio, fim = 0, inicio;
        inicio = patients.size() - 1;
        while (fim <= inicio) {
            meio = (fim + inicio) / 2;
            if (patients.get(meio).getCod() == cod) {
                return patients.get(meio);
            } else if (patients.get(meio).getCod() < cod) {
                fim = meio + 1;
            } else {
                inicio = meio - 1;
            }
        }
        return null;
    }
}
