package tech.devjc.calificacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CalificacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalificacionApplication.class, args);
	}

}
