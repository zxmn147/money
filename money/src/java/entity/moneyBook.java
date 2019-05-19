/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 伶娸
 */
@Entity
public class moneyBook implements Serializable {

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
    
    
     @Temporal(TemporalType.DATE)
    private Date everyYM;

    /**
     * Get the value of everyYM
     *
     * @return the value of everyYM
     */
    public Date getEveryYM() {
        return everyYM;
    }

    /**
     * Set the value of everyYM
     *
     * @param everyYM new value of everyYM
     */
    public void setEveryYM(Date everyYM) {
        this.everyYM = everyYM;
    }
    
   private float inMoney;

    /**
     * Get the value of inMoney
     *
     * @return the value of inMoney
     */
    public float getInMoney() {
        return inMoney;
    }

    /**
     * Set the value of inMoney
     *
     * @param inMoney new value of inMoney
     */
    public void setInMoney(float inMoney) {
        this.inMoney = inMoney;
    }

    private float outMoney;

    /**
     * Get the value of outMoney
     *
     * @return the value of outMoney
     */
    public float getOutMoney() {
        return outMoney;
    }

    /**
     * Set the value of outMoney
     *
     * @param outMoney new value of outMoney
     */
    public void setOutMoney(float outMoney) {
        this.outMoney = outMoney;
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
        if (!(object instanceof moneyBook)) {
            return false;
        }
        moneyBook other = (moneyBook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.moneyBook[ id=" + id + " ]";
    }
    
}
