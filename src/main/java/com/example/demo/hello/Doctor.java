package com.example.demo.hello;

import java.util.List;

public class Doctor {
    int amka;
    String name;
    String surname;
    List<Timeslot> timeslotList;

    public Doctor(int amka, String name, String surname, List<Timeslot> timeslotList) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslotList = timeslotList;
    }

    public int getAmka() {
        return amka;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }
}
