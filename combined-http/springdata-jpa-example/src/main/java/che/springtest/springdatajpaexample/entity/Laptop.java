package che.springtest.springdatajpaexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="laptop")
public class Laptop {
    @Id
//    @Column(name="laptopId")
    Integer lId;
//    @Column(name="laptopName")
    String lName;

    @OneToOne //@Column(name="studentId")
    Student student;

    /*@ManyToMany
    @JoinTable(name="Laptop_Student",
            joinColumns = @JoinColumn(name ="newLId", referencedColumnName = "lId"),
            inverseJoinColumns = @JoinColumn(name = "newSId", referencedColumnName = "stuId"))
    private List<Student> studentArray;
*/

/*
    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Student> getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(List<Student> studentArray) {
        this.studentArray = studentArray;
    }
    */
}
