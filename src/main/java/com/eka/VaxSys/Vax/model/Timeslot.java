package com.eka.VaxSys.Vax.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

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

    LocalDate date;

    boolean booked = false;

    @ManyToMany(mappedBy = "timeslot")
    Set<VaxCenter> vaxCenter;

    @ManyToMany(mappedBy = "timeslots")
    Set<Doctor> doctors;

    public Timeslot(){};

    public Timeslot(int id, int tDay, int tMonth, int tYear, int startHour, int startMinutes, int endHour, int endMinutes, Set<VaxCenter> vaxCenter, Set<Doctor> doctors, LocalDate date) {
        this.id = id;
        this.tDay = tDay;
        this.tMonth = tMonth;
        this.tYear = tYear;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
        this.doctors = doctors;
        this.vaxCenter = vaxCenter;
        this.date = date;
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



    public Set<VaxCenter> getVaxCenter() {
        return vaxCenter;
    }

    public void setVaxCenter(Set<VaxCenter> vaxCenter) {
        this.vaxCenter = vaxCenter;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
