/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityControl;
import entity.members;
import entity.status;
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
public class statusFacade extends AbstractFacade<status>{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     @PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public statusFacade() {
        super(status.class);
      
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public status find(Class<status> aClass, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


