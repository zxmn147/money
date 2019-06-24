/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.incomeKind;
import entity.income;
import entityControl.accountFacade;
import entityControl.incomeFacade;
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
@Named(value = "incomeCid")
@RequestScoped
public class incomeCid {
    
    @EJB
    private incomeKindFacade incomeKind;
    
    @EJB
    private incomeFacade incomes;
    
    @EJB
    private accountFacade accountFacade;
    
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
    
    

    
    public String incomeKindPage(){
        return "incomeKind";
    }
    
    public String incomeNewPage(){
        return "home";
    }
    
    private income newIncome = new income();

    public income getNewIncome() {
        return newIncome;
    }

    public void setNewIncome(income newIncome) {
        this.newIncome = newIncome;
    }
    
    public Long member(String memberId){
//        System.out.println(memberId);
        for(int i=0;i<accountFacade.count();i++){
            System.out.println(accountFacade.findAll().get(i).getUsername());
            if (accountFacade.findAll().get(i).getUsername().equals(memberId)){
//                System.out.println("accountFacade.findAll().get(i).getId()");
//                System.out.println(accountFacade.findAll().get(i).getId());
                Long member_id = accountFacade.findAll().get(i).getId(); 
                return member_id;
            }
        } 
        return null;
    }
    
    public String incomeCreate(String memberId){
        newIncome.setMember_id(member(memberId));
        newIncome.setIncomeKind(incomeKind.findAll().get(incomeKindID).getName());
        System.out.println(newIncome.getMember_id());
        System.out.println(newIncome.getDate());
        System.out.println(newIncome.getIncomeKind());
        System.out.println(newIncome.getItemName());
        System.out.println(newIncome.getMoney());
        System.out.println(newIncome.getNote());
        incomes.create(newIncome);
        return "index";
    }

    public List<income> findincomeItemAll(){
        return incomes.findAll();
    }
    
    public incomeCid() {
    }
    
    
    
    
    
}
