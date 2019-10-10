package che.ems.project;

import che.ems.project.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectService;
}
