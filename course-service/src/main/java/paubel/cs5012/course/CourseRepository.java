// CS5012 Bryce Paubel hw2 2/28/23
// Definition for CourseRepository to access courses in the database

package paubel.cs5012.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
