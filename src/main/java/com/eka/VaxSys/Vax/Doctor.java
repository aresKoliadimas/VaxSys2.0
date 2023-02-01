package com.eka.VaxSys.Vax;

import javax.persistence.*;
import java.util.*;

@Entity
public class Doctor {

    @Id
    int AMKA_Doctor;
    String name;
    String lastName;
    @OneToMany(mappedBy="slot_id", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    List<Timeslot> timeslot = new ArrayList<Timeslot>();

    public Doctor() {}

    public Doctor(int AMKA_Doctor, String name, String lastName, List<Timeslot> timeslot) {
        this.AMKA_Doctor = AMKA_Doctor;
        this.name = name;
        this.lastName = lastName;
        this.timeslot = timeslot;
    }

    public int getAMKA_Doctor() {
        return AMKA_Doctor;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Timeslot> getTimeslot() {
        return timeslot;
    }
}
