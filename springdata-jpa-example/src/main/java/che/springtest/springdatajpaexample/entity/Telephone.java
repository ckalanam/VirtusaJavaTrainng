package che.springtest.springdatajpaexample.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="telephone")
public class Telephone {

    @Id
//    @Column(name="telephoneId")
    Integer tId;
//    @Column(name="telephoneNo")
    String tNo;

    @ManyToOne //@Column(name="studentId")
    @JsonIgnore
    Student student;


    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}
