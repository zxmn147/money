package entity;

import entity.income;
import entity.moneyBook;
import entity.outlay;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-24T13:59:55")
@StaticMetamodel(members.class)
public class members_ { 

    public static volatile SingularAttribute<members, Date> birthday;
    public static volatile CollectionAttribute<members, income> incomes;
    public static volatile SingularAttribute<members, String> password;
    public static volatile CollectionAttribute<members, outlay> outlays;
    public static volatile CollectionAttribute<members, moneyBook> moneyBooks;
    public static volatile SingularAttribute<members, String> phone;
    public static volatile SingularAttribute<members, String> name;
    public static volatile SingularAttribute<members, Long> id;
    public static volatile SingularAttribute<members, String> job;
    public static volatile SingularAttribute<members, Float> upperMoney;
    public static volatile SingularAttribute<members, String> email;
    public static volatile SingularAttribute<members, String> username;

}