package che.springtest.springdatajpaexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="address")
public class Address {
    @Id
//    @Column(name="addressId")
    Integer aid;
//    @Column(name="addressName")
    String aName;

    @OneToMany (mappedBy = "address")//@Column(name="studentId")
            List <Student> studentArray2;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public List<Student> getStudentArray2() {
        return studentArray2;
    }

    public void setStudentArray2(List<Student> studentArray2) {
        this.studentArray2 = studentArray2;
    }
}
