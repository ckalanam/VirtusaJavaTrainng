package che.springtest.springdatajpaexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="project")
public class Project {

    @Id
//    @Column(name="projectId")
    Integer pId;
//    @Column(name="projectLabel")
    String pLabel;

    @ManyToMany (mappedBy = "projectArray")//@Column(name="studentId")
    List<Student>studentArray;
}
