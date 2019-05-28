/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entity.outlayKind;
import entityControl.outlayKindFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author sunny
 */
@Named(value = "outlay")
@RequestScoped
public class outlay {
    
    
    @EJB
    private outlayKindFacade outlayKind;
    
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
    
    /**
     * Creates a new instance of outlay
     */
    public outlay() {
    }
    
}
