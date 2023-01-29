package com.example.demo.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timeslot {
    @Id
    int tDay;
    int tMonth;
    int tYear;
    int startHour;
    int startMinutes;
    int endHour;
    int endMinutes;

    public Timeslot(){};
    public Timeslot(int tDay, int tMonth, int tYear, int startHour, int startMinutes, int endHour, int endMinutes) {
        this.tDay = tDay;
        this.tMonth = tMonth;
        this.tYear = tYear;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
    }

    public int getDay() {
        return tDay;
    }

    public int getMonth() {
        return tMonth;
    }

    public int getYear() {
        return tYear;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getStartMinutes() {
        return startMinutes;
    }

    public int getEndHour() {
        return endHour;
    }

    public int getEndMinutes() {
        return endMinutes;
    }
}
