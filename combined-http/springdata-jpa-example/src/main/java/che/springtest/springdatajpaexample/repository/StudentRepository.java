package che.springtest.springdatajpaexample.repository;

import che.springtest.springdatajpaexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<Student,Integer> {
}
