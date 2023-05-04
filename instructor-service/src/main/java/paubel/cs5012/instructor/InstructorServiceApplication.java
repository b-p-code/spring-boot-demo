// CS5012 Bryce Paubel hw4 4/10/23
// Main application class, only bootstraps

package paubel.cs5012.instructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
@SpringBootApplication
@EnableBinding(Source.class)
public class InstructorServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(InstructorServiceApplication.class, args);
	}
}
