/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author fatma
 */
public class Order {
 private int userId;
 private Products pro;
 private  Users user;
 private String productId;

    public Products getPro() {
        return pro;
    }

    public void setPro(Products pro) {
        this.pro = pro;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    private Date date;


    public Order() {
    }
    
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

 

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
   
    
    
    
}
