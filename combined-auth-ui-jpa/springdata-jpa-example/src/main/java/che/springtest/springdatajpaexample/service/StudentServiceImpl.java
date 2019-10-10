package che.springtest.springdatajpaexample.service;

import che.springtest.springdatajpaexample.entity.Student;
import che.springtest.springdatajpaexample.entity.Telephone;
import che.springtest.springdatajpaexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){ // any name

        for(Telephone telephone:student.getTelephoneArray()){
            telephone.setStudent(student);
        }
        return studentRepository.save(student);
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id){ // any name
        return studentRepository.findById(id);
    }
}
