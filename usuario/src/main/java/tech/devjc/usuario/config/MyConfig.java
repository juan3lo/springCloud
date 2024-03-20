package tech.devjc.usuario.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



/**
* @author juan3lo
* 
*/

@Configuration
public class MyConfig {
	
	@Bean	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}


