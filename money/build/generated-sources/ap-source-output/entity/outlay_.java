package entity;

import entity.outlayKind;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-21T00:28:23")
@StaticMetamodel(outlay.class)
public class outlay_ { 

    public static volatile SingularAttribute<outlay, Character> note;
    public static volatile SingularAttribute<outlay, outlayKind> outlay_kind;
    public static volatile SingularAttribute<outlay, Character> itemName;
    public static volatile SingularAttribute<outlay, Float> money;
    public static volatile SingularAttribute<outlay, Long> id;
    public static volatile SingularAttribute<outlay, Date> Date;

}