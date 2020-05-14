/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.CustomerLoginBll;

/**
 *
 * @author User
 */
public interface CustomerLoginDao {
    public boolean userAccess(CustomerLoginBll clb);
}
