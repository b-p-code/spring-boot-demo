// CS5012 Bryce Paubel 3/18/23
// Discovery service to discover and register services with

// Note - bootstrap.yml is deprecated in this version of Spring Boot, so application.yml is used

package paubel.cs5012.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}

}
