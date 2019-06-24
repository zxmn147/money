/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.outlay;
import entity.outlayKind;
import entityControl.outlayKindFacade;
import entityControl.outlayFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author 伶娸
 */
@Named(value = "outlayCdi")
@SessionScoped
public class outlayCdi implements Serializable{

    /**
     * Creates a new instance of outlayCdi
     */
    @EJB
    private outlayKindFacade outlayKind;
     private outlayFacade outlayF;
    
    public String outlayKindPage(){
        return "outlayKind";
    }
//    populate outlayKind Items
    public void init(){
        outlayKind outlayKind1 = new outlayKind();
        outlayKind1.setName("食");
        outlayKind.create(outlayKind1);
        outlayKind outlayKind2 = new outlayKind();
        outlayKind2.setName("衣");
        outlayKind.create(outlayKind2);
        outlayKind outlayKind3 = new outlayKind();
        outlayKind3.setName("住");
        outlayKind.create(outlayKind3);
        outlayKind outlayKind4 = new outlayKind();
        outlayKind4.setName("行");
        outlayKind.create(outlayKind4);
        outlayKind outlayKind5 = new outlayKind();
        outlayKind5.setName("娛樂");
        outlayKind.create(outlayKind5);
        
    }
//  find all if null we will do init() 
    public List<outlayKind> findoutlayKindAll(){
        if(outlayKind.findAll().size() > 0){
            return outlayKind.findAll();
        }else{
            this.init();
            return outlayKind.findAll();
        }
    }
//    create outlayKind Items
    
    private String newOutlayKind;

    /**
     * Get the value of newOutlayKind
     *
     * @return the value of newOutlayKind
     */
    public String getNewOutlayKind() {
        return newOutlayKind;
    }

    /**
     * Set the value of newOutlayKind
     *
     * @param newOutlayKind new value of newOutlayKind
     */
    public void setNewOutlayKind(String newOutlayKind) {
        this.newOutlayKind = newOutlayKind;
    }

    public String outlayKindCreate(){
        outlayKind addOutlayKind = new outlayKind();
        addOutlayKind.setName(newOutlayKind);
        outlayKind.create(addOutlayKind);
        return "outlayKind";
    }
    
    private outlay newOutlay;

    /**
     * Get the value of newOutlay
     *
     * @return the value of newOutlay
     */
    public outlay getNewOutlay() {
        return newOutlay;
    }

    /**
     * Set the value of newOutlay
     *
     * @param newOutlay new value of newOutlay
     */
    public void setNewOutlay(outlay newOutlay) {
        this.newOutlay = newOutlay;
        
    }

    
    public String goNewItemPage(){
        newOutlay = new outlay();
        return "newout";
    }
    
    private long outKindID = 51;

    /**
     * Get the value of outKindID
     *
     * @return the value of outKindID
     */
    public long getOutKindID() {
        return outKindID;
    }

    /**
     * Set the value of outKindID
     *
     * @param outKindID new value of outKindID
     */
    public void setOutKindID(long outKindID) {
        this.outKindID = outKindID;
        System.out.println(this.outKindID);
    }
    
    public String outlayCreate(){
        newOutlay.setMemberID(1);
        System.out.println(newOutlay.getItemName());
        System.out.println(newOutlay.getMoney());
        System.out.println(newOutlay.getNote());
        System.out.println(newOutlay.getOutlayKind());
        System.out.println(newOutlay.getAddDate());
        /*outlayF.create(newOutlay);*/
        return "index";
    }
    
    /**
     * Creates a new instance of outlay
     */
    public outlayCdi() {
    }
}
