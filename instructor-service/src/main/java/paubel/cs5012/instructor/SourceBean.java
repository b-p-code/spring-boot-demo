// CS5012 Final Project 3/29/2023 Bryce Paubel
// Instructor source bean used to send messages to Kafka
// Heavily based on class examples

package paubel.cs5012.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SourceBean {
    private Source source;

    @Autowired
    public SourceBean(Source source){
        this.source = source;
    }

    public void publishInstructorChange(String action, String instructor) {
        System.out.println("Sending Kafka message " + action + " for instructor: " + instructor);
        InstructorChangeMessage change = new InstructorChangeMessage(action, instructor);
        source.output().send(MessageBuilder.withPayload(change).build());
    }
}