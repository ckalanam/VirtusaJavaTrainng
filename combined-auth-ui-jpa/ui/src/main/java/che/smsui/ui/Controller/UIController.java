package che.smsui.ui.Controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

    @RequestMapping(value = "/")
    public String loadHome(){
        return "index"; // this should be same as the name of .html file
    }

    @RequestMapping(value = "/load")
    public String methodLoad(){
        return "home"; // this should be same as the name of .html file
    }
}
