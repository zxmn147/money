/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityControl;

import entity.outlay;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 伶娸
 */
@Stateless
@LocalBean
public class outlayFacade  extends AbstractFacade<outlay>{
@PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public outlayFacade() {
        super(outlay.class);
      
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public outlay find(Class<outlay> aClass, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
