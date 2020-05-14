/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.AdminLoginBll;

/**
 *
 * @author User
 */
public class AdminLoginDaoImpl implements AdminLoginDao{
    private String finalUsername = "admin"; 
    private String finalPassword = "admin123";
    @Override
    public boolean userCredentials(AdminLoginBll alb) {
        return alb.getUsername().equals(finalUsername) && alb.getPassword().equals(finalPassword); //To change body of generated methods, choose Tools | Templates.
    
}
}
