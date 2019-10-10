package che.springtest.springdatajpaexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telephone2 {

    @Id
    private Integer tId;
        private String tName;

    @ManyToOne
    Student2 studentObj2;
}
