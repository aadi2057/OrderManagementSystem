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
public interface AdminLoginDao {

    /**
     *
     * @param alb
     * @return
     */
    public boolean userCredentials(AdminLoginBll alb);
}