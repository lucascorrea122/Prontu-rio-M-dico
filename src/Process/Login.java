///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Process;
//
//import Model.People;
//import static Process.Query.VerifyFile;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author LucasCorrea
// */
//public class Login {
//    
//    private static String typeTxt;
//    private static String userNameTxt;    
//    private static List<People> users = new ArrayList<People>();
//    
//        public static void createUsers(String fileName) {
//
//        String filePath = VerifyFile(fileName, false);
//
//        if (filePath != null) {
//
//            try {
//                BufferedReader br = new BufferedReader(new FileReader(filePath));
//                String srt;
//                while ((srt = br.readLine()) != null) {
//                    People user = new People(srt,br.readLine(), br.readLine(), br.readLine(), br.readLine()) {
//
//                        @Override
//                        public String writeFile() {
//                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                        }
//                    };
//                    users.add(user);
//                }
//
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
//
//        
//    
//        public static boolean verifyLogin(String name, char[] passwordArray) {
//
//        //************************************************************************
//        //esta parte verifica se existe algum administrador cadastrado se não existir usa o default Admin Admin
//        if (VerifyFile("Admistrator.csv", false) == null) {
//            if (name.equals("Admin")) {
//                String password = "";
//                for (int i = 0; i < passwordArray.length; i++) {
//                    password += passwordArray[i]; // transformando o arrya de char, para uma string;
//                }
//                if (password.equals("1")) {
//                    userNameTxt = "Admin";
//                    typeTxt = "Admin";
//                    return true;
//                }
//            }
//        }
//        //************************************************************************
//
//        
//        
//        createUsers("users.txt");
//        createUsers("admins.txt");
//
//        //faz a verificação em todos os usuários junção dos dois txts
//        for (User user : users) {
//            //Verificando se o email existe dentro la lista de usuários
//            if (user.email.equals(userEmail)) {
//                //se existir cria o password para verificalo tbm
//                String password = "";
//                for (int i = 0; i < passwordArray.length; i++) {
//                    password += passwordArray[i]; // transformando o arrya de char, para uma string;
//                }
//                if (user.password.equals(password)) {
//
//                    userNameTxt = user.name;
//                    typeTxt = user.type;
//
//                    return true;
//                } else {
//                    JOptionPane.showMessageDialog(null, "Senha inválida", "Erro", JOptionPane.ERROR_MESSAGE);
//                    return false;
//                }
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "Email não cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
//        return false;
//
//    }
//    
//    
//}
