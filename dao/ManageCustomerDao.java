/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.ManageCustomerBll;

/**
 *
 * @author User
 */
public interface ManageCustomerDao {
    public void removeUser(ManageCustomerBll mcb);
    public void editUser(ManageCustomerBll mcb);
    
}
