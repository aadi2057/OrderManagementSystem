/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.AddCustomerBll;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AddCustomerDaoImpl implements AddCustomerDao{

    /**
     *
     * @param acb
     */
    @Override
    public void writeFile(AddCustomerBll acb) {
        File f = new File("src/textFiles/Customer.txt");
        
     
        try {
            if (!f.exists()){
                f.createNewFile();
            }
            int i=0;
            int id = 0;
            BufferedReader br = new BufferedReader(new FileReader(f));
            Object[] tableLines = br.lines().toArray();
                                
                for(i=0; i<tableLines.length;i++){
                    String line = tableLines[i].toString().trim();
                    String[] tableRow = line.split(",");
                    try{
                    id = Integer.parseInt(tableRow[0]);
                    }
                    catch(NumberFormatException e){
                        System.out.println("NO ID found");
                    }
                    
                }
                
                acb.setUserId(id+1);
            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(acb.getUserId()+","+acb.getUsername() + "," +acb.getAddress() + "," + acb.getPassword() + "," + acb.getGender() + "," + acb.getContactNo());
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
