/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.CustomerLoginBll;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author User
 */
public class CustomerLoginDaoImpl implements CustomerLoginDao {
     /**
     *
     * @param clb
     * @return 
     */
    @Override
    public boolean userAccess(CustomerLoginBll clb) {
        try{
            File f = new File("src/textFiles/activeUser.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            PrintWriter pw = new PrintWriter(bw);
            FileReader fr=new FileReader("src/textFiles/Customer.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line=null;
                String []splt=null;
                
                while((line=br.readLine())!=null){
                    splt=line.split(",");
                    clb.setCustomerId(Integer.parseInt(splt[0]));
                    
                    if(splt[1].equals(clb.getUsername()) && splt[3].equals(clb.getPassword())) {
                        System.out.println(clb.getCustomerId());
                        pw.println(clb.getCustomerId()+","+clb.getUsername());
                        pw.flush();
                        pw.close();
                        return true;
                    }
                    
                }
                
            }
        }
        catch(IOException e){
            System.out.println("FileNotFound");
        }
         //To change body of generated methods, choose Tools | Templates.
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
//To change body of generated methods, choose Tools | Templates.

    
    

 
    
    
}
