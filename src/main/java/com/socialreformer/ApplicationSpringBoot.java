package com.socialreformer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*import com.socialreformer.service.EventService;
import com.socialreformer.service.EventServiceImpl;*/


@SpringBootApplication(scanBasePackages={"com.socialreformer/main.resources"})

@ComponentScan
public class ApplicationSpringBoot {
	public static void main(String args[]){
		   SpringApplication.run(ApplicationSpringBoot.class, args);
	}
	

	

}
