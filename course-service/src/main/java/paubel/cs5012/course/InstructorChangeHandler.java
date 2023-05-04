// CS5012 Final Project 3/29/2023 Bryce Paubel
// The change handler for the sink input
// Heavily based on class examples

package paubel.cs5012.course;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class InstructorChangeHandler {
    // Listen on the input channel
    @StreamListener(Sink.INPUT)
    public void sinkHandler(InstructorChangeMessage message) {
        // Display a message based on the action of the InstructorChangeMessage
        switch (message.getAction()) {
            case "GET":
                System.out.println("Received a GET event from the instructor service for instructor: " + message.getName());
                break;
            case "POST":
                System.out.println("Received a POST event from the instructor service for instructor: " + message.getName());
                break;
            case "PUT":
                System.out.println("Received an PUT event from the instructor service for instructor: " + message.getName());
                break;
            case "DELETE":
                System.out.println("Received a DELETE event from the instructor service for instructor: " + message.getName());
                break;
            default:
                System.out.println("Received an UNKOWN event from the instructor service for instructor: " + message.getName());
                break;
        }
    }
}