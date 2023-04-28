// CS5012 Bryce Paubel 3/18/23
// Configuration service to provide configuration files for our services

// Note - bootstrap.yml is deprecated in this version of Spring Boot, so application.yml is used

package paubel.cs5012.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
