package com.eka.VaxSys.Vax;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timeslot {
    @Id
    int id;
    int tDay;
    int tMonth;
    int tYear;
    int startHour;
    int startMinutes;
    int endHour;
    int endMinutes;
    int AMKA_Doctor;
    int ID_Center;

    public Timeslot(){};

    public Timeslot(int id, int tDay, int tMonth, int tYear, int startHour, int startMinutes, int endHour, int endMinutes, int AMKA_Doctor, int ID_Center) {
        this.id = id;
        this.tDay = tDay;
        this.tMonth = tMonth;
        this.tYear = tYear;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
        this.AMKA_Doctor = AMKA_Doctor;
        this.ID_Center = ID_Center;
    }

    public int getId() {
        return id;
    }

    public int gettDay() {
        return tDay;
    }

    public int gettMonth() {
        return tMonth;
    }

    public int gettYear() {
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

    public int getAMKA_Doctor() {
        return AMKA_Doctor;
    }

    public int getID_Center() {
        return ID_Center;
    }
}
