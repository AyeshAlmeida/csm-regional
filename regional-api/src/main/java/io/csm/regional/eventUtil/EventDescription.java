package io.csm.regional.eventUtil;

public class EventDescription {
    private String name;
    private String description;
    private int priorityLevel;

    @Override
    public String toString() {
        return "EventDescription{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
