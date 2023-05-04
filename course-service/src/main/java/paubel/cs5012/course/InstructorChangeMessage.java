// CS5012 3/29/23 Final Project Bryce Paubel
// Instructor change message to be passed with Kafka

package paubel.cs5012.course;

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