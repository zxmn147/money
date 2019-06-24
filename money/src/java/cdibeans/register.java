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
import java.security.Principal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 伶娸
 */
@Named(value = "register")
@SessionScoped
public class register implements Serializable{
    @EJB
    private accountFacade accountFacade;
     @Inject
    private Principal principal;
    private HttpServletRequest request;
    /**
     * Creates a new instance of money
     */
    public register() {
    }
    
    public String getPrincipalName() {
        return principal.getName();
    }
    
    private long id1;

    /**
     * Get the value of id1
     *
     * @return the value of id1
     */
    public long getId1() {
        return id1;
    }

    /**
     * Set the value of id1
     *
     * @param id1 new value of id1
     */
    public void setId1(long id1) {
        this.id1 = id1;
    }

    
    private String ID ;

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public String getID() {
        return ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

     private int a =0;
     private members newItem;
    

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    
    private String account;

    /**
     * Get the value of account
     *
     * @return the value of account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Set the value of account
     *
     * @param account new value of account
     */
    public void setAccount(String account) {
        this.account = account;
    }
    
    private String password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
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
     
    private members updateItem;

    /**
     * Get the value of updateItem
     *
     * @return the value of updateItem
     */
    public members getUpdateItem() {
        return updateItem;
    }

    /**
     * Set the value of updateItem
     *
     * @param updateItem new value of updateItem
     */
    public void setUpdateItem(members updateItem) {
        this.updateItem = updateItem;
    }

    
      public String create() {
       if (newItem.getUsername() ==null && newItem.getPassword() ==null){
                a=2;
        }
        for(int i=0;i<accountFacade.count();i++){
            if (newItem.getUsername().equals(accountFacade.findAll().get(i).getUsername())) {
                a=2;
                break;
            }
       }      
          System.out.println(a);
       if (a==0){
        System.out.println(newItem.getName());
        newItem.setStatus("member");
        accountFacade.create(newItem);
        return "login1";
       }
       else{
           a=0;
           return "register";
       } 
       
}

  /*  public String login(){
        for(int i=0;i<accountFacade.count();i++){
            if (account.equals(accountFacade.findAll().get(i).getUsername()) && password.equals(accountFacade.findAll().get(i).getPassword()) && (account!=null && password!=null)) {
               ID = accountFacade.findAll().get(i).getId();
               System.out.println(ID);
               return "main"; 
            }
        } 
        return "index"; 
    }
    
    public String logout(){
        ID = id1;
        System.out.println(ID);
        return "login1"; 
    }
    */
    public String edit(){
        ID = getPrincipalName();
        System.out.println(ID);
        /*System.out.println(updateItem.getId());*/
        for(int i=0;i<accountFacade.count();i++){
            if (ID.equals(accountFacade.findAll().get(i).getUsername())) {
                id1=accountFacade.findAll().get(i).getId();
         } 
        }
        this.updateItem = accountFacade.find(id1);
        System.out.println(updateItem.getId());

        return null;
       
    }
    
    public String update(){
        accountFacade.edit(updateItem);
        return "account";
    }
}
