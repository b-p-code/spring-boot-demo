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
