package com.chethana.auth.authserver.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
public class AuthServerConfigurations extends WebSecurityConfigurerAdapter
        implements AuthorizationServerConfigurer {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

        security.checkTokenAccess("permitAll()");

    }

    @Override
    public void configure(ClientDetailsServiceConfigurer client) throws Exception {

        client.inMemory().withClient("web")
                .secret(passwordEncoder.encode("webpass"))
                .scopes("READ","WRITE")
                .authorizedGrantTypes("password","authorization_code")
                .redirectUris("http://localhost:8082/login");
//                .redirectUris("http://localhost:8082/login");

    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoint) throws Exception {

        endpoint.authenticationManager(authenticationManager);

    }
}

/*
spring:
        security:
        user:
        name: chetha
        password: chetha123
        roles : ADMIN,USER
        security:
        oauth2:
        client:
        client-id: mobile
        client-secret: pin
        access-token-validity-seconds: 3600
        authorized-grant-types: refresh_token,authorization_code,password,client_credentials
        scope: READ,WRITE
        authorization:
        check-token-access: permitAll
        */
