package com.eka.VaxSys.Vax;

import javax.persistence.*;

@Entity
public class Vaccination {
    @Id
    int slot_id;
//        @OneToOne
//                @JoinColumn(name = "AMKA_Citizen")
//    Citizen citizen;
//    @OneToOne
//            @JoinColumn(name = "AMKA_Doctor")
//    Doctor doctor;
    int vaxDay;
    int vaxMonth;
    int vaxYear;
    int endDay;
    int endMonth;
    int endYear;

    public Vaccination() {}

    public Vaccination(int slot_id, Citizen citizen, Doctor doctor, int vaxDay, int vaxMonth, int vaxYear, int endDay, int endMonth, int endYear) {
        this.slot_id = slot_id;
//        this.citizen = citizen;
//        this.doctor = doctor;
        this.vaxDay = vaxDay;
        this.vaxMonth = vaxMonth;
        this.vaxYear = vaxYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public int getSlot_id() {
        return slot_id;
    }

//    public Citizen getCitizen() {
//        return citizen;
//    }
//
//    public Doctor getDoctor() {
//        return doctor;
//    }

    public int getVaxDay() {
        return vaxDay;
    }

    public int getVaxMonth() {
        return vaxMonth;
    }

    public int getVaxYear() {
        return vaxYear;
    }

    public int getEndDay() {
        return endDay;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public int getEndYear() {
        return endYear;
    }
}
