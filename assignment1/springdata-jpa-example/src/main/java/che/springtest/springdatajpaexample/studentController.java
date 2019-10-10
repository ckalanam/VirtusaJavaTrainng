package che.springtest.springdatajpaexample;

import che.springtest.springdatajpaexample.entity.Address;
import che.springtest.springdatajpaexample.entity.Student;
import che.springtest.springdatajpaexample.entity.Telephone;
import che.springtest.springdatajpaexample.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "sms")
public class studentController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping(value = "hello")
    public String greeting(){
        return "hello springboot";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentService.getStudent();
    }

    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

/*    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Student getStudent(){

        Student student = new Student();
        //student.setStuId();
        student.setName("Saman");
        Address address = new Address();
        address.setaName("Galle");
        student.setAddress(address);

        List<Telephone> telephones = new ArrayList<>();
        Telephone telephone = new Telephone();
        telephone.settNo("09873");
        telephones.add(telephone);
        student.setTelephoneArray(telephones);
        return student;
    }*/
}
