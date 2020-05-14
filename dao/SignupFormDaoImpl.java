/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.SignupFormBll;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SignupFormDaoImpl implements SignupFormDao{

    @Override
    public void newUserDetails(SignupFormBll sfb) {
        File f = new File("src/textFiles/Accountrequest.txt");
        
     
        try {
            if (!f.exists()){
                f.createNewFile();
            }
            
            
            
            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(sfb.getUsername() + "," +sfb.getAddress() + "," + sfb.getPassword() + "," + sfb.getGender() + "," + sfb.getPhoneNo());
                pw.flush();
                pw.close();
                bw.close();
                fw.close();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            System.out.println("Successfully Wrote in file.....");
            
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
