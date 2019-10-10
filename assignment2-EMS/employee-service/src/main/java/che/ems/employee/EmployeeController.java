package che.ems.employee;

import che.ems.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ems")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

}
