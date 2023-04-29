// CS5012 Bryce Paubel hw4 4/10/23
// Controller for the instructor
// Maps requests to get, save, and delete objects in the database

// Prefix: /instructor

package paubel.cs5012.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    SourceBean source;

    // Instructor repository object
    private final InstructorRepository instructorRepository;

    // Inject the instructor repository object
    @Autowired
    public InstructorController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    // Get all instructors in the database
    @GetMapping
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    // Insert an instructor into the database
    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        source.publishInstructorChange("POST", instructor.getName());
        return instructorRepository.save(instructor);
    }

    // Delete an instructor in the database by ID
    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        Optional<Instructor> instructor = instructorRepository.findById(id);

        if (!instructor.isPresent()) {
            System.out.println("Attempted to DELETE: " + instructor.get().getName() + ", but instructor does not exist!");
            return;
        }

        source.publishInstructorChange("DELETE", instructor.get().getName());
        instructorRepository.deleteById(id);
    }
}