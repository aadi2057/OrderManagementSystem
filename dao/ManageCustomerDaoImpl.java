/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.ManageCustomerBll;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Clothes;

/**
 *
 * @author User
 */
public class ManageCustomerDaoImpl implements ManageCustomerDao{
    @Override
    public void removeUser(ManageCustomerBll mcb) {
        File file = new File("src/textFiles/Customer.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
                
            }
   
                Object[] tableLines = br.lines().toArray();
                int i=0;
                
                
               
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                   // System.out.println("Out of first loop");
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        //System.out.println(i);
                   
                        int userId = Integer.parseInt(tableRows[0]);
                        if(mcb.getCustomerId()== userId && mcb.getUsername().equals(tableRows[1]) ){
     
                            //pwp.println(tableRows[0]+","+tableRows[1]+","+tableRows[2]+","+newStock+","+tableRows[4]);
                            // pw.println(clb.getCustomerId()+","+ clb.getUsername() + ","+ prodname + "," +"Clothes,"+ quantity +","+ rate*quantity+","+ dtf.format(now)
                          
                        }
                        else{
                            pwp.println(lines);
                        }
                    }
                    
                    pwp.flush();
                    pwp.close();
                } catch (IOException ex) {           
                Logger.getLogger(ManageCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }           
             
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Clothes.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(ManageCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
//                System.out.println("Inside first loop");
        //To change body of generated methods, choose Tools | Templates.
        
                
//                System.out.println("Inside first loop");
             //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editUser(ManageCustomerBll mcb) {
        File file = new File("src/textFiles/Customer.txt");
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(file));
            if(!file.exists()){
                file.createNewFile();
                
            }
   
                Object[] tableLines = br.lines().toArray();
                int i=0;
                
                
               
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
                   // System.out.println("Out of first loop");
                    for(i=0; i<tableLines.length;i++){
                        String lines = tableLines[i].toString().trim();
                        String[] tableRows = lines.split(",");
                        //System.out.println(i);
                   
                        int userId = Integer.parseInt(tableRows[0]);
                        if(mcb.getCustomerId()== userId && mcb.getUsername().equals(tableRows[1]) ){
                            System.out.println("If block is printed");
                            //pwp.println(tableRows[0]+","+tableRows[1]+","+tableRows[2]+","+newStock+","+tableRows[4]);
                             pwp.println(userId+","+ mcb.getNewUsername() + ","+ mcb.getNewAddress() + "," +mcb.getNewPassword()+  "," + tableRows[4]+","+ mcb.getNewPhoneNo());
                          
                        }
                        else{
                            System.out.println("Else block is printed");
                            pwp.println(lines);
                        }
                    }
                    
                    pwp.flush();
                    pwp.close();
                } catch (IOException ex) {           
                Logger.getLogger(ManageCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }           
             
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Clothes.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(ManageCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
