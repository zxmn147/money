/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.UserTransaction;

/**
 *
 * @author 伶娸
 */
@Entity
public class outlay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
  
    @Column(length = 30)
    private String outlayKind;

    /**
     * Get the value of outlayKind
     *
     * @return the value of outlayKind
     */
    public String getOutlayKind() {
        return outlayKind;
    }

    /**
     * Set the value of outlayKind
     *
     * @param outlayKind new value of outlayKind
     */
    public void setOutlayKind(String outlayKind) {
        this.outlayKind = outlayKind;
    }

    private long memberID;

    /**
     * Get the value of memberID
     *
     * @return the value of memberID
     */
    public long getMemberID() {
        return memberID;
    }

    /**
     * Set the value of memberID
     *
     * @param memberID new value of memberID
     */
    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }


    
    @Column(length = 30)
    private String itemName;

    /**
     * Get the value of itemName
     *
     * @return the value of itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Set the value of itemName
     *
     * @param itemName new value of itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    private float money;

    /**
     * Get the value of money
     *
     * @return the value of money
     */
    public float getMoney() {
        return money;
    }

    /**
     * Set the value of money
     *
     * @param money new value of money
     */
    public void setMoney(float money) {
        this.money = money;
    }
    
    @Temporal(TemporalType.DATE)
     private Date addDate;

    /**
     * Get the value of addDate
     *
     * @return the value of addDate
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * Set the value of addDate
     *
     * @param addDate new value of addDate
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
   
    
    @Column(length = 12)
    private String note;
   


    /**
     * Get the value of note
     *
     * @return the value of note
     */
        
    public String getNote() {
        return note;
    }

    /**
     * Set the value of note
     *
     * @param note new value of note
     */
    public void setNote(String note) {
        this.note = note;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof outlay)) {
            return false;
        }
        outlay other = (outlay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.outlay[ id=" + id + " ]";
    }

    public void persist(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>moneyPU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
}
