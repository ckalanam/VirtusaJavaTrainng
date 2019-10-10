package che.springtest.springdatajpaexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generating primary key value (incremental value)
    private Integer aid;
        private String addressName;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return addressName;
    }

    public void setAname(String aname) {
        this.addressName = aname;
    }

}
