/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.status;
import entityControl.statusFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 伶娸
 */
@Named(value = "member_status")
@RequestScoped
public class member_status {

    /**
     * Creates a new instance of member_status
     */
    @EJB
    private statusFacade statusKind;
//    populate incomkind Items
    public void init(){
        status statusKind1 = new status();
        statusKind1.setName("member");
        statusKind.create(statusKind1);
    }
    
    public member_status() {
    }
    
}
