package che.springtest.springdatajpaexample.testDb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BClass {
    @Id
    Integer bId;
    String BClassName;

    @OneToMany
    List <AClass> aClassArray;
}
