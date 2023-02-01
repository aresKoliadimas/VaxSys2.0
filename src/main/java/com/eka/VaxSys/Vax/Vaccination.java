package com.eka.VaxSys.Vax;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaccination {
    @Id
    int vaxId;
    int AMKA_Citizen;
    int AMKA_Doctor;
    int vaxDay;
    int vaxMonth;
    int vaxYear;
    int endDay;
    int endMonth;
    int endYear;

    public Vaccination() {}

    public Vaccination(int vaxId, int AMKA_Citizen, int AMKA_Doctor, int vaxDay, int vaxMonth, int vaxYear, int endDay, int endMonth, int endYear) {
        this.vaxId = vaxId;
        this.AMKA_Citizen = AMKA_Citizen;
        this.AMKA_Doctor = AMKA_Doctor;
        this.vaxDay = vaxDay;
        this.vaxMonth = vaxMonth;
        this.vaxYear = vaxYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public int getVaxId() {
        return vaxId;
    }

    public int getAMKA_Citizen() {
        return AMKA_Citizen;
    }

    public int getAMKA_Doctor() {
        return AMKA_Doctor;
    }

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
