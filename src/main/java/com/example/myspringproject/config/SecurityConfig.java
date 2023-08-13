package com.example.myspringproject.config;

//import com.example.myspringproject.Authenticate.MyDatabaseUserDetailsService;
import com.example.myspringproject.Authenticate.MyDatabaseUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/public-*", "/").permitAll()
                .antMatchers("/api-admin/").hasAnyRole("ADMIN")
                .antMatchers("/api-user/").hasAnyRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/public-api-login").permitAll()
                .and()
                .logout().permitAll();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new MyDatabaseUserDetailsService();
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
