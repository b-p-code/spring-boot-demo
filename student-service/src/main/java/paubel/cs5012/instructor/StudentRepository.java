// CS5012 Bryce Paubel hw2 2/28/23
// Definition for StudentRepository to access students in the database

package paubel.cs5012.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
