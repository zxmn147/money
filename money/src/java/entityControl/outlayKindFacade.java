package entityControl;
import entity.outlayKind;
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
public class outlayKindFacade extends AbstractFacade<outlayKind>{

    @PersistenceContext(unitName = "moneyPU")
    private EntityManager em;
    
    // default constructor
    public outlayKindFacade() {
        super(outlayKind.class);
      
    }
    
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public outlayKind find(Class<outlayKind> aClass, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
