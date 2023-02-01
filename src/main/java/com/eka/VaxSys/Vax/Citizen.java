package com.eka.VaxSys.Vax;

import javax.persistence.*;

@Entity
public class Citizen {
    @Id
    int AMKA_Citizen;
    int AFM_Citizen;
    String name;
    String lastName;
    String email;

    public Citizen() {}

    public Citizen(int AMKA_Citizen, int AFM_Citizen, String name, String lastName, String email) {
        this.AMKA_Citizen = AMKA_Citizen;
        this.AFM_Citizen = AFM_Citizen;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
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
}
