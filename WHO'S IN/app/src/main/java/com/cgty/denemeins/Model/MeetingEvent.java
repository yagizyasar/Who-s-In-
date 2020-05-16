package com.cgty.denemeins.Model;

import java.util.Date;

public class MeetingEvent extends Event {

    public String toString() {
        return "Meeting Event Title: " + getTitle() + ", Organizer: " + getOrganizerId() + ", Capacity: " + getCapacity() + ", Privacy: " + getPrivacySetting();
    }

    public MeetingEvent() {
    }

    public MeetingEvent(String eventId, String title, String organizerId, Date date, String description, int capacity, String mainType, String subType, String location, String privacySetting) {
        super(eventId, title, organizerId, date, description, capacity, mainType, subType, location, privacySetting);
    }


}