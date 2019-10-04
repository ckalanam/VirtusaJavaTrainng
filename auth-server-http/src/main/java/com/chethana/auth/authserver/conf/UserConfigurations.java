package com.chethana.auth.authserver.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfigurations extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("chetha").password(passwordEncoder.encode("123"))
                .roles("USER","ADMIN","MANAGER")
                .authorities("CAN READ","CAN WRITE","CAN DELETE")
                .and()
                .withUser("kala").password(passwordEncoder.encode("kalapass"))
                .roles("USER")
                .authorities("CAN READ","CAN WRITE");
    }
}
