/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityControl;

import entity.income;
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
public class incomeFacade  extends AbstractFacade<income>{
@PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public incomeFacade() {
        super(income.class);
      
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public income find(Class<income> aClass, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
