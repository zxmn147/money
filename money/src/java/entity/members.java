/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.xml.registry.uddi.bindings_v2_2.Email;
import entity.income;
import entity.moneyBook;
import entity.outlay;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.internal.constraintvalidators.EmailValidator;

/**
 *
 * @author 伶娸
 */
@Entity
public class members implements Serializable {

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
    private char name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public char getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(char name) {
        this.name = name;
    }
    
    @Column(length = 15)
    private char username;

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public char getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(char username) {
        this.username = username;
    }

    @Column(length = 15)
    private char password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public char getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(char password) {
        this.password = password;
    }
    
    @Temporal(TemporalType.DATE)
    private Date birthday;

    /**
     * Get the value of birthday
     *
     * @return the value of birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Set the value of birthday
     *
     * @param birthday new value of birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Column(length = 13)
    private char phone;

    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public char getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(char phone) {
        this.phone = phone;
    }
    
    
    private String job;

    /**
     * Get the value of job
     *
     * @return the value of job
     */
    public String getJob() {
        return job;
    }

    /**
     * Set the value of job
     *
     * @param job new value of job
     */
    public void setJob(String job) {
        this.job = job;
    }
    
            private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


   

   private float upperMoney;

    /**
     * Get the value of upperMoney
     *
     * @return the value of upperMoney
     */
    public float getUpperMoney() {
        return upperMoney;
    }

    /**
     * Set the value of upperMoney
     *
     * @param upperMoney new value of upperMoney
     */
    public void setUpperMoney(float upperMoney) {
        this.upperMoney = upperMoney;
    }

    @OneToMany(cascade = CascadeType.ALL) 
    @JoinColumn(name = "member_ID", referencedColumnName = "ID")  
    private Collection<income> incomes;  
    
    @OneToMany(cascade = CascadeType.ALL) 
    @JoinColumn(name = "member_ID", referencedColumnName = "ID")  
    private Collection<outlay> outlays;
    
    @OneToMany(cascade = CascadeType.ALL) 
    @JoinColumn(name = "member_ID", referencedColumnName = "ID")  
    private Collection<moneyBook> moneyBooks;  
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof members)) {
            return false;
        }
        members other = (members) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.members[ id=" + id + " ]";
    }
    
}
