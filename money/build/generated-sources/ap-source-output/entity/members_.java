package entity;

import com.sun.xml.registry.uddi.bindings_v2_2.Email;
import entity.moneyBook;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-19T16:31:42")
@StaticMetamodel(members.class)
public class members_ { 

    public static volatile SingularAttribute<members, Date> birthday;
    public static volatile SingularAttribute<members, moneyBook> men_money;
    public static volatile SingularAttribute<members, Character> password;
    public static volatile SingularAttribute<members, Character> phone;
    public static volatile SingularAttribute<members, Character> name;
    public static volatile SingularAttribute<members, Long> id;
    public static volatile SingularAttribute<members, String> job;
    public static volatile SingularAttribute<members, Float> upperMoney;
    public static volatile SingularAttribute<members, Email> email;
    public static volatile SingularAttribute<members, Character> username;

}