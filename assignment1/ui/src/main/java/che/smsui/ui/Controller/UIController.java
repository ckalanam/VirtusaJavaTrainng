package che.smsui.ui.Controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value = "sms")
@EnableOAuth2Sso
public class UIController extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().
                antMatchers("/").
                permitAll().
                anyRequest().
                authenticated();
    }

    @RequestMapping(value = "/home")
    public String methodDefault(){
        return "index"; // this should be same as the name of .html file
    }

    @RequestMapping(value = "/")
    public String loadHome(){
        return "home"; // this should be same as the name of .html file
    }

    @RequestMapping(value = "/create")
    public String methodLoad(){
        return "create"; // this should be same as the name of .html file
    }

    @RequestMapping(value = "/find")
    public String methodFindBy(){
        return "findbyid"; // this should be same as the name of .html file
    }

    @RequestMapping(value = "/show")
    public String methodShowAll(){
        return "showall"; // this should be same as the name of .html file
    }

}
