package che.springtest.springdatajpaexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer stuId;

    String name;


    public Student(Integer stuId, String name, Integer marks) {
        this.stuId = stuId;
        this.name = name;
    }

    public Student() {
    }

    //regarding to the relationship with laptop class
//    @OneToOne(mappedBy = "sId")
//    Integer lId;

    //regarding to the relationship with project class
    @ManyToMany //@Column(name="projectId")
    @JoinTable(name="student_project",
            joinColumns = @JoinColumn(name="jointStudentId",referencedColumnName = "stuId"),
            inverseJoinColumns = @JoinColumn(name="jointProjectId",referencedColumnName="pId"))
    List<Project>projectArray;

    //regarding to the relationship with telephone class
    @OneToMany (mappedBy = "student")//@Column(name="projectId")
    List<Telephone>telephoneArray;

    //regarding to the relationship with address class
    @ManyToOne //@Column(name="addressId")
    Address address;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjectArray() {
        return projectArray;
    }

    public void setProjectArray(List<Project> projectArray) {
        this.projectArray = projectArray;
    }

    public List<Telephone> getTelephoneArray() {
        return telephoneArray;
    }

    public void setTelephoneArray(List<Telephone> telephoneArray) {
        this.telephoneArray = telephoneArray;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
