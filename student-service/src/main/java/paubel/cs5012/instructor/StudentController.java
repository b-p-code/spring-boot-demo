// CS5012 Bryce Paubel hw2 2/28/23
// Controller for the student model object
// Maps requests to get, save, and delete objects in the database

// Prefix: /student

package paubel.cs5012.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    // Student repository object
    private final StudentRepository studentRepository;

    // Inject the student repository object
    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students in the database
    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // Insert a student into the database
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student.getName());
        System.out.println(student.getMajor());
        System.out.println(student.getYear());
        return studentRepository.save(student);
    }

    // Delete a student in the database by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
