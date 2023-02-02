package com.eka.VaxSys.Vax;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Citizen {
    @Id
    int AMKA_Citizen;
    int AFM_Citizen;
    String name;
    String lastName;
    String email;
//    @OneToOne
//            @JoinColumn (name = "slot_id")
//    Vaccination vax;

    @ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name="Appointment",
            joinColumns = @JoinColumn(name="AMKA_Citizen"),
            inverseJoinColumns = @JoinColumn(name="slot_id"))
    private List<Timeslot> tList = Arrays.asList(new Timeslot[3]);

    public void addTimeslot(Timeslot t) {
        tList.add(t);
    }

    public Citizen() {}

    public Citizen(int AMKA_Citizen, int AFM_Citizen, String name, String lastName, String email, Vaccination vax) {
        this.AMKA_Citizen = AMKA_Citizen;
        this.AFM_Citizen = AFM_Citizen;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
       // this.vax = vax;
        //this.timeslot = timeslot;
    }

    public int getAMKA_Citizen() {
        return AMKA_Citizen;
    }

    public int getAFM_Citizen() {
        return AFM_Citizen;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

//    public Vaccination getVax() {
//        return vax;
//    }
    public List<Timeslot> getTimeslot() {return tList;}

}
