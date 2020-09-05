package net.viralpatel.spring.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import net.viralpatel.spring.model.Customer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.viralpatel.spring")
public class AppConfig {
	
	public AppConfig(){
		System.out.println("Configuration class created.....  ");
	}
	
	
	@Bean
	public Customer getCustomer(){
		System.out.println("Customer Bean created.....  ");
		Customer customer = new Customer();
		customer.setId(111357729L);
		customer.setFirstName("Devdutt");
		customer.setLastName("Jadeja");
		customer.setEmail("devdutt.jadeja@accenture.com");
		customer.setMobile("8446592322");
		customer.setDateOfBirth(new Date());
		return customer;
	}
	
	
	

}