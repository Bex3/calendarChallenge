package com.example;

import javax.persistence.*;

/**
 * Created by bearden-tellez on 12/21/16.
 */

    @Entity
    @Table(name = "events")

    public class Event {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(nullable = false)
    String date;

    @Column(nullable = false)
    String location;

    @Column (nullable = false)
    String information;

    @Column (nullable = true)
    Boolean reminder;

    @OneToOne
    User user;

//    @OneToOne
//    Calendar calendar;

    public Event(String name, String date, String location, String information, Boolean reminder, User user) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.information = information;
        this.reminder = reminder;
        this.user = user;
//        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Boolean getReminder() {
        return reminder;
    }

    public void setReminder(Boolean reminder) {
        this.reminder = reminder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public Calendar getCalendar() {
//        return calendar;
//    }
//
//    public void setCalendar(Calendar calendar) {
//        this.calendar = calendar;
//    }
}
