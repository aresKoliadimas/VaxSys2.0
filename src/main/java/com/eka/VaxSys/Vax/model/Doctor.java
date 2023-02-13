package com.eka.VaxSys.Vax.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Doctor {

    @Id
    Integer id;
    @Column(unique = true)
    String AMKA;
    String name;
    String surname;


    @ManyToMany
    @JoinTable(name = "doctor_timeslot",
            joinColumns = {@JoinColumn(name = "doctor_id")},
            inverseJoinColumns = {@JoinColumn(name = "timeslot_id")})
    Set<Timeslot> timeslots;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAMKA() {
        return AMKA;
    }

    public void setAMKA(String AMKA) {
        this.AMKA = AMKA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslot(Set<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }
}
