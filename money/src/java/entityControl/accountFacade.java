package entityControl;
import entity.income;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 * @since Apr 29, 2019
 */
@Stateless
@LocalBean
public class accountFacade extends AbstractFacade<income>{

    @PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public accountFacade() {
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
