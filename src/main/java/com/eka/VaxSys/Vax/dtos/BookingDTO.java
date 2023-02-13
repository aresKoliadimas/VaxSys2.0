package com.eka.VaxSys.Vax.dtos;

import com.eka.VaxSys.Vax.model.Doctor;
import com.eka.VaxSys.Vax.model.Patient;
import com.eka.VaxSys.Vax.model.Timeslot;

public class BookingDTO {

    Patient patient;
    Timeslot timeslot;
    Doctor doctor;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
