// CS5012 Bryce Paubel hw4 4/10/23
// Course model object

// NOTE - I had to add a lot of mapping information to the database
// because of the fact that the JPA itself was not creating the table
// For this reason, there are added column and sequence annotations

package paubel.cs5012.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "course")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {
    // Primary key, generated by a sequence in the database
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "course_id_seq")
    @SequenceGenerator(name="course_id_seq", sequenceName = "course_id_seq", allocationSize=1)
    @Column(name = "id")
    private Long id;

    // Course number, maps to coursenumber
    @Column(name = "coursenumber")
    private String courseNumber;

    // Course name, maps to coursename
    @Column(name = "coursename")
    private String courseName;

    // Capacity, mapped to capacity
    @Column(name = "capacity")
    private Long capacity;

    // Instructor, mapped to instructor
    @Column(name = "instructor")
    private String instructor;

    // Extra information that can be appended to the class,
    // specified as transient fields
    @Transient
    private String office;
    @Transient
    private String phone;
    @Transient
    private String email;

    /* Constructors */
    public Course() {
    }

    public Course(String courseNumber, String courseName, Long capacity) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
    }

    public Course(Long id, String courseNumber, String courseName, Long capacity) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
    }

    public Course(Long id, String courseNumber, String courseName, Long capacity, String instructor) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
        this.instructor = instructor;
    }

    public Course(String courseNumber, String courseName, Long capacity, String instructor) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
        this.instructor = instructor;
    }
    /* End constructors */

    /* Getters and setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* End getters and setters */
}
