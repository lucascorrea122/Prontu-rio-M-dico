/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasCorrea
 */
public class Query {
    
    /**
     * 
     * @param fileName
     * @param jList 
     */
    public static void createListModel(String fileName, javax.swing.JList<String> jList){
    
        String filePath = VerifyFile(fileName, false);
        
        if (filePath != null) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String strLine;
                DefaultListModel listModel = new DefaultListModel();

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                br.close();
                jList.setModel(listModel);

            } catch (IOException ex) {
               // Logger.getLogger(ViewDoctors.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Não existe nenhum cadastro", "Erro", JOptionPane.PLAIN_MESSAGE);

        }

        
    
    }
    
    /**
     *
     * @param fileName
     * @param writer
     * @return
     */
    public static String VerifyFile(String fileName, boolean writer) {

        String filePath = null;

        if (writer == true) {

           filePath = System.getenv("user.dir") + System.getProperty("file.separator") + fileName;
                    
                    

        } else if (new File(System.getenv("user.dir") + System.getProperty("file.separator") + fileName).exists()) {

            filePath = System.getenv("user.dir") + System.getProperty("file.separator") + fileName;

        }
        return filePath;

    }

    
}
