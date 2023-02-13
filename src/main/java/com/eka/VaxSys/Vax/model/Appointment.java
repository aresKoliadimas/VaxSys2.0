package com.eka.VaxSys.Vax.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    Integer id;

    @ManyToOne
    @JoinTable(name = "doctor_appointment",
            joinColumns = {@JoinColumn(name = "appointment_id")},
            inverseJoinColumns = {@JoinColumn(name = "doctor_id")})
    Doctor doctor;

    @OneToOne(mappedBy = "appointment")
    Patient patient;

    LocalDate vaxDate;

    LocalDate expirationDate;


    boolean verifiedByDoc = false;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getVaxDate() {
        return vaxDate;
    }

    public void setVaxDate(LocalDate vaxDate) {
        this.vaxDate = vaxDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isVerifiedByDoc() {
        return verifiedByDoc;
    }

    public void setVerifiedByDoc(boolean verifiedByDoc) {
        this.verifiedByDoc = verifiedByDoc;
    }
}
