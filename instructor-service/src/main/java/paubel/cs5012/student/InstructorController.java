// CS5012 Bryce Paubel hw4 4/10/23
// Controller for the instructor
// Maps requests to get, save, and delete objects in the database

// Prefix: /instructor

package paubel.cs5012.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    // Student repository object
    private final InstructorRepository instructorRepository;

    // Inject the student repository object
    @Autowired
    public InstructorController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    // Get all students in the database
    @GetMapping
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    // Insert a student into the database
    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    // Delete a student in the database by ID
    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorRepository.deleteById(id);
    }
}