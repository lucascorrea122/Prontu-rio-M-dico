/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Model.Medicine;
import Model.MedicineType;
import Model.Symptom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.codegen.types.Type;

/**
 *
 * @author LucasCorrea
 */
public class ListMedicineCrud {
    
    String name = "Medicines";
    
    private List<Medicine> medicines = new ArrayList();
    
    public ListMedicineCrud(String name){
        this.name=name;
    }
    
    
    public boolean insert(Medicine medicine) {
        medicines.add(medicine);
        return true;
    }
    
    public boolean writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator")
                    +this.name
                    + ".csv"));

            for (Medicine medicine : medicines) {
                bw.write(medicine.writeFile());
            }
            
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public void readingMedicines() throws FileNotFoundException, IOException {
        String name = "", line, convert = "";
        int codig = 0, aux = 0;
        String tipo="";

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
                                name = convert;
                                break;
                            case 1:
                                tipo = convert;
                        }
                        //</editor-fold>

                        convert = "";
                        aux++;
                    } else {
                        convert += line.charAt(i);
                    }

                }

                Medicine medicine = new Medicine(name, tipo);
                aux = 0;
                this.medicines.add(medicine);
                aux = 0;
            }

        } while (line != null);

        br.close();
    }

    public Medicine consultByCode(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Medicine> getLista() {
        return this.medicines;
    }
    
    
}
