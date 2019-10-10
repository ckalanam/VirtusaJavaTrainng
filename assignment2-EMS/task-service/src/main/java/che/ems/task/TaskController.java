package che.ems.task;

import che.ems.task.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;
}
