// CS5012 Bryce Paubel hw2 2/28/23, updated for hw4 4/10/23
// Controller for the course model object
// Maps requests to get, save, and delete objects in the database

// Prefix: /course

package paubel.cs5012.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {
    // Repository object
    private final CourseRepository courseRepository;

    // Service object
    private final CourseService courseService;

    // Inject the CourseRepository object
    @Autowired
    public CourseController(CourseRepository courseRepository, CourseService courseService) {
        this.courseRepository = courseRepository;
        this.courseService = courseService;
    }

    // Return all courses
    @GetMapping
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    // Return courses along with extra information
    @GetMapping("/{id}")
    public Course getExtraCourseInformation(@PathVariable Long id) {
        // First, get a course from the repository
        Optional<Course> course = courseRepository.findById(id);
        if (!course.isPresent()) {
            return null;
        }

        // Output that a call is occurring between course-instructor services
        System.out.println("COURSE SERVICE CALLING INSTRUCTOR SERVICE FOR INSTRUCTOR: " + course.get().getInstructor());

        // Retrieve extra instructor information from instructor service
        Instructor instructor = courseService.getInstructorInfo(course.get().getInstructor());
        if (instructor == null) {
            return null;
        }

        // Append the new data to the course object
        // through the transient fields
        course.get().setOffice(instructor.getOffice());
        course.get().setPhone(instructor.getPhone());
        course.get().setEmail(instructor.getEmail());

        return course.get();
    }

    // Insert a course
    @PostMapping
    public Course addStudent(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    // Delete a course by ID
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }
}

