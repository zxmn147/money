/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 伶娸
 */
@Entity
public class income implements Serializable {

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
    
    @OneToOne(cascade = CascadeType.ALL)
    // Specity join column name and referened column name.
    @JoinColumn(name = "income_kind", referencedColumnName = "ID")
    private incomeKind income_kind;
    
    
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
    private Date Date;

    /**
     * Get the value of Date
     *
     * @return the value of Date
     */
    public Date getDate() {
        return Date;
    }

    /**
     * Set the value of Date
     *
     * @param Date new value of Date
     */
    public void setDate(Date Date) {
        this.Date = Date;
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
        if (!(object instanceof income)) {
            return false;
        }
        income other = (income) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.income[ id=" + id + " ]";
    }
    
}
