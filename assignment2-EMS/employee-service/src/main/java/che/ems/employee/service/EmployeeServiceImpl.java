package che.ems.employee.service;

import che.ems.employee.model.Employee;
import che.ems.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }

}
