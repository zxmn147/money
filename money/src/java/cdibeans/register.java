/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.members;
import entityControl.accountFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author 伶娸
 */
@Named(value = "register")
@SessionScoped
public class register implements Serializable{
    @EJB
    private accountFacade accountFacade;
    /**
     * Creates a new instance of money
     */
    public register() {
    }
    
   
     private members newItem;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
     
    private char account;

    /**
     * Get the value of account
     *
     * @return the value of account
     */
    public char getAccount() {
        return account;
    }

    /**
     * Set the value of account
     *
     * @param account new value of account
     */
    public void setAccount(char account) {
        this.account = account;
    }
    
    private char password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public char getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(char password) {
        this.password = password;
    }


    public members getNewItem() {
        return newItem;
    }

    public void setNewItem(members newItem) {
        this.newItem = newItem;
    }
    
     public String goNewItemPage(){
        newItem = new members();
        return "register";
    }
    
    public String create() {
        accountFacade.create(newItem);
        return "index";
}

    public String finALL(){
        for(int i=0;i<accountFacade.count();i++){
            if (account ==accountFacade.findAll().get(i).getUsername() && password ==accountFacade.findAll().get(i).getPassword()) {
              return "main"; 
            }
        } 
        return "index"; 
    }
}
