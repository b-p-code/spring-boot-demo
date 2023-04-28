// CS5012 Bryce Paubel hw4 4/10/23
// Definition for InstructorRepository to access students in the database

package paubel.cs5012.instructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
