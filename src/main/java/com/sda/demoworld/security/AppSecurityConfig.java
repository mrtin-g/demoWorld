package com.sda.demoworld.security;

import com.sda.demoworld.user.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
   private AppUserDetailsService appUserDetailsService;

    @Bean
    BCryptPasswordEncoder passwordEncoder (){ return new BCryptPasswordEncoder();}

    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider =
                new DaoAuthenticationProvider();
        provider.setUserDetailsService
                (appUserDetailsService);
        provider.setPasswordEncoder
                (this.passwordEncoder());
        return provider;
    }

    public void configure(HttpSecurity httpSecurity) throws  Exception{
        httpSecurity
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/register").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/css/**").permitAll()
//                .antMatchers("/").permitAll()
                .antMatchers("/adminonly").hasRole("ADMIN")
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/createLoc").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/logout-success").permitAll()

        ;

    }

}
