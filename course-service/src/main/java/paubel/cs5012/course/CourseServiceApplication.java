// CS5012 Bryce Paubel hw2 2/28/23
// Main application class, only bootstraps

package paubel.cs5012.course;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

	// Make a rest template that is load balancer aware
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
