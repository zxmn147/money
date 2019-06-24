/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.incomeKind;
import entityControl.incomeKindFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author sunny
 */
@Named(value = "income")
@RequestScoped
public class income {
    
    @EJB
    private incomeKindFacade incomeKind;
//    populate incomkind Items
    public void init(){
        incomeKind incomeKind1 = new incomeKind();
        incomeKind1.setName("主要來源");
        incomeKind.create(incomeKind1);
        incomeKind incomeKind2 = new incomeKind();
        incomeKind2.setName("其他");
        incomeKind.create(incomeKind2);
    }
//    get incomeKind if null we will do init()
    public List<incomeKind> findincomeAll(){
        if(incomeKind.findAll().size() > 0){
            System.out.println("not null");
            return incomeKind.findAll();
        }else{
            this.init();
            System.out.println("null do");
            return incomeKind.findAll();
        }
        
    }
    
//    create new incomeKind Items
    private String newIncomeKind;

    /**
     * Get the value of newIncomeKind
     *
     * @return the value of newIncomeKind
     */
    public String getNewIncomeKind() {
        return newIncomeKind;
    }

    /**
     * Set the value of newIncomeKind
     *
     * @param newIncomeKind new value of newIncomeKind
     */
    public void setNewIncomeKind(String newIncomeKind) {
        this.newIncomeKind = newIncomeKind;
    }

    public String incomeKindCreate(){
        incomeKind addIncomeKind = new incomeKind();
        addIncomeKind.setName(newIncomeKind);
        incomeKind.create(addIncomeKind);
        return "incomeKind";
    }
    
    private int incomeKindID;

    /**
     * Get the value of incomeKindID
     *
     * @return the value of incomeKindID
     */
    public int getIncomeKindID() {
        return incomeKindID;
    }

    /**
     * Set the value of incomeKindID
     *
     * @param incomeKindID new value of incomeKindID
     */
    public void setIncomeKindID(int incomeKindID) {
        this.incomeKindID = incomeKindID;
    }
    
    public String incomeCreate(){
        incomeKind addIncomeKind = new incomeKind();
        addIncomeKind.setName(newIncomeKind);
        incomeKind.create(addIncomeKind);
        return "incomeKind";
    }

    
    public String incomeKindPage(){
        return "incomeKind";
    }
    
    
    public income() {
    }
    
    
    
    
    
}
