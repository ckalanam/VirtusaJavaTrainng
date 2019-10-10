package che.auth2.authserver2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfigurartion extends WebSecurityConfigurerAdapter {

    @Bean
    AuthenticationManager AuthenticationManager() throws Exception{
        return super.authenticationManagerBean();
    }
}
