package main;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan("soa.*")
@EnableJpaRepositories("soa.repository")
@EntityScan("soa.*") 
public class Main {
	
	public static void main(String[] args) {

		 SpringApplication.run(Main.class, args);

	}

}
