package che.smsui.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

    @RequestMapping(value = "/")
    public String methodLoad(){
        return "home"; // this should be same as the name of .html file
    }
}
