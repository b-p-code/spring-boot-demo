// CS5012 Bryce Paubel hw2 2/28/23
// Main application class, only bootstraps

package paubel.cs5012.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
@SpringBootApplication
public class StudentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
}
