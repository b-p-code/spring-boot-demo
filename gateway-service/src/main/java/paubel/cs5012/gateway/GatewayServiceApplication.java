// CS5012 Bryce Paubel final project 4/25/23
// Main application class, only bootstraps

package paubel.cs5012.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}
