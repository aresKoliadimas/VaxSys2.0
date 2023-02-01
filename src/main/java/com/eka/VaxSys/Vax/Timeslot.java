package com.eka.VaxSys.Vax;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Timeslot {
    @Id
    private int slot_id;
    private int tDay;
    private int tMonth;
    private int tYear;
    private int startHour;
    private int startMinutes;
    private int endHour;
    private int endMinutes;
    @ManyToOne
            @JoinColumn(name = "AMKA_Doctor")
    private Doctor doctor;
    private int ID_Center;

    public Timeslot(){};

    public Timeslot(int slot_id, int tDay, int tMonth, int tYear, int startHour, int startMinutes, int endHour, int endMinutes, Doctor doctor, int ID_Center) {
        this.slot_id = slot_id;
        this.tDay = tDay;
        this.tMonth = tMonth;
        this.tYear = tYear;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
        this.doctor = doctor;
        this.ID_Center = ID_Center;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getSlotId() {
        return slot_id;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public int getID_Center() {
        return ID_Center;
    }
}
