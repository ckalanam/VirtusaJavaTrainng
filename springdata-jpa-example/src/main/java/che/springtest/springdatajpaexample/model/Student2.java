package che.springtest.springdatajpaexample.model;

import che.springtest.springdatajpaexample.entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sId;
    private String name;

    @OneToOne(cascade =CascadeType.ALL)
    private Address addressObj;

    @OneToMany(mappedBy = "studentObj2")
    List<Telephone2> telephoneArray;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddressObj() {
        return addressObj;
    }

    public void setAddressObj(Address addressObj) {
        this.addressObj = addressObj;
    }

}
