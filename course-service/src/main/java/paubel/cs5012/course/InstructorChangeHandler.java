package paubel.cs5012.course;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class InstructorChangeHandler {
    @StreamListener(Sink.INPUT)
    public void sinkHandler(InstructorChangeMessage message) {

        switch(message.getAction()){
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

class InstructorChangeMessage {
    String action;
    String name;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstructorChangeMessage(String action, String name) {
        this.action = action;
        this.name = name;
    }
}