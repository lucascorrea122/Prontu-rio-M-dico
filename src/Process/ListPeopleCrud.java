/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;


import Model.Administrator;
import Model.Doctor;
import Model.People;
import Model.Secretary;
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
public class ListPeopleCrud implements ListPeoples {

    private List<People> persons = new ArrayList();
    private String type;

    public ListPeopleCrud(String type) {
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
        for (People people1 : this.persons) {
            if (people1.getCod() == cod) {
                person.setCod(people1.getCod());
                int index = persons.indexOf(people1);
                persons.set(index, person);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int cod) {
        for (People person : persons) {
            if (person.getCod() == cod) {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator")
                    + this.type + ".csv"));

            for (People person : persons) {
                bw.write(person.writeFile());
            }
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public boolean readFile() {
        File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + this.type + ".txt");

        if (file.exists()) {
            switch (this.type) {
                case "Administrator":
                    try {
                        readingAdministrator();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(ListPeopleCrud.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Doctor":
                    try {
                        readingDoctor();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(ListPeopleCrud.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Secretary":
                    try {
                        readingSecrretary();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(ListPeopleCrud.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readingDoctor() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0, year = 0, id = 0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + this.type + ".svs"));

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
                                id = Integer.parseInt(convert);
                                break;    
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Doctor doctor = new Doctor(name, year, id);
                aux = 0;
                this.persons.add(doctor);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }

    public void readingAdministrator() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0, year = 0, id=0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + this.type + ".csv"));

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
                                id = Integer.parseInt(convert);
                                break;    
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Administrator adm = new Administrator(name, year, id);
                aux = 0;
                this.persons.add(adm);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }

    public void readingSecrretary() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0, year = 0, id=0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + this.type + ".csv"));

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
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Secretary secretary = new Secretary(name, year, id);
                aux = 0;
                this.persons.add(secretary);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }

    @Override
    public void readingUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<People> getLista() {
        return this.persons;
    }
    
}
