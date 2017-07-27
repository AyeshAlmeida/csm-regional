package io.csm.regional;

import io.csm.regional.eventUtil.EventDescription;
import io.csm.regional.eventUtil.Venue;

import java.util.Date;

public class Event {
    private String name;
    private Date startTime;
    private Date endTime;
    private Venue venue;
    private EventDescription eventType;

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", venue=" + venue +
                ", eventType=" + eventType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventDescription getEventType() {
        return eventType;
    }

    public void setEventType(EventDescription eventType) {
        this.eventType = eventType;
    }
}
