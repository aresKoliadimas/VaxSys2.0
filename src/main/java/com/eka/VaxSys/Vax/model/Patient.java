package com.eka.VaxSys.Vax.model;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    Integer id;

    @Column(unique = true)
    String AFM;

    @Column(unique = true)
    String AMKA;

    @Column(unique = true)
    String email;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    Appointment appointment;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAFM() {
        return AFM;
    }

    public void setAFM(String AFM) {
        this.AFM = AFM;
    }

    public String getAMKA() {
        return AMKA;
    }

    public void setAMKA(String AMKA) {
        this.AMKA = AMKA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
