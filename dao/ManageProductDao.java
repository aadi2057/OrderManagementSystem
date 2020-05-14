/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bll.ManagerProductBll;

/**
 *
 * @author User
 */
public interface ManageProductDao {
    public void removeProduct(ManagerProductBll mpb);
    public void editProduct(ManagerProductBll mcb);
    
}
