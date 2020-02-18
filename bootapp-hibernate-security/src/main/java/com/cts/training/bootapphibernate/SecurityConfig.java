package com.cts.training.bootapphibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


// Configuration class to define security Rules
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// WebSecurityConfigurerAdapter : provides 3 methods : configure
	
	// dependency
	@Autowired
	private DataSource dataSource;
	
	// configure the credentials repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		/********** JDBC Authentication ***************/
		
		// default schema
		auth.jdbcAuthentication().dataSource(dataSource);
		
		// custom schema
		/*auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery("")  // for reading username and password (authentication)
			.authoritiesByUsernameQuery(""); // for reading roles (authorazation)
		*/
		
		
				
	}
	
	// secure the application : define the accessibility rule
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		
		.cors() 
		.and()
		.csrf().disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS,"/api/**").hasRole("USER")
		//.antMatchers(HttpMethod.POST,"/api/**").hasRole("ADMIN")
		//.antMatchers(HttpMethod.GET,"/api/**").hasRole("ADMIN")
		
		.and()
		.httpBasic();
		
		
	}
}


/***********
 * {bcrypt}$2a$04$ON6IrjLRg7WWRB5k/E8sfOvHwBiCz.8kmDTVywU/WUC5UZoJm0OiO
 */









