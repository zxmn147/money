package entityControl;
import entity.incomeKind;
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
public class incomeKindFacade extends AbstractFacade<incomeKind>{

    @PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public incomeKindFacade() {
        super(incomeKind.class);
      
    }
    
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public incomeKind find(Class<incomeKind> aClass, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
