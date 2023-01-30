package com.eka.VaxSys.Vax;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {
    @Id
    int id;
    int amkaCitizen;
    int idTimeslot;

    public Appointment() {}

    public Appointment(int id, int amkaCitizen, int idTimeslot) {
        this.id = id;
        this.amkaCitizen = amkaCitizen;
        this.idTimeslot = idTimeslot;
    }

    public int getId() {
        return id;
    }

    public int getAmkaCitizen() {
        return amkaCitizen;
    }

    public int getIdTimeslot() {
        return idTimeslot;
    }
}
