package com.socialreformer;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.socialreformer.service.EventService;
import com.socialreformer.service.EventServiceImpl;
import org.apache.commons.dbcp.BasicDataSource;
@Configuration
public class ApplicationConfig {

	/*@Bean
	EventService eventService() {
		return new EventServiceImpl();
	}*/
	

	    @Bean
	    public BasicDataSource dataSource() throws URISyntaxException {
	        URI dbUri = new URI(System.getenv("CLEARDB_DATABASE_URL"));

	        String username = dbUri.getUserInfo().split(":")[0];
	        String password = dbUri.getUserInfo().split(":")[1];
	        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + dbUri.getPath();
            System.out.println("URL:"+ dbUrl);
	        BasicDataSource basicDataSource = new BasicDataSource();
	        basicDataSource.setUrl(dbUrl);
	        basicDataSource.setUsername(username);
	        System.out.println("UNAME:"+ basicDataSource.getUsername() );
	        
	        basicDataSource.setPassword(password);
	        System.out.println("URL pass:"+ basicDataSource.getPassword());

	        return basicDataSource;
	    }
	

}
