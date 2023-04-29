// CS5012 hw4 Bryce Paubel 4/10/23
// Services for the course service. In this case, it only retrieves information
// from the instructor service

package paubel.cs5012.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    RestTemplate restTemplate;

    Instructor getInstructorInfo(String name) {
        // Get the array of instructor objects from the instructor-service
        // through a load-balanced REST call
        System.out.println("SEARCHING FOR INSTRUCTOR WITH THE NAME: " + name);
        Instructor[] instructorList = null;
        ResponseEntity<Instructor[]> restExchange =
                restTemplate.exchange(
                        "http://instructor-service/instructor",
                        HttpMethod.GET,
                        null, Instructor[].class);
        instructorList = restExchange.getBody();

        // Return null if the list is null
        if (instructorList == null) {
            System.out.println("RETURNED INSTRUCTOR LIST IS NULL");
            return null;
        }

        // Simple linear search for instructor
        for (int i = 0; i < instructorList.length; i++) {
            System.out.println(instructorList[i].getName());
            if (instructorList[i].getName().equals(name)) {
                return instructorList[i];
            }
        }

        // If we get to this point, return null and report error
        System.out.println("UNABLE TO FIND INSTRUCTOR IN THE LIST");
        return null;
    }
}
