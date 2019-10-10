package che.springtest.springdatajpaexample.testDb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AClass {
    @Id
    Integer aId;
    String aClassName;

    @ManyToOne
    BClass bClassObj;
}
