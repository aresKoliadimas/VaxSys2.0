package com.eka.VaxSys.Vax;

import javax.persistence.*;

@Entity
public class Vaccination {
    @Id
    int AMKA_Citizen;
    int vaxDay;
    int vaxMonth;
    int vaxYear;
    int endDay;
    int endMonth;
    int endYear;

    public Vaccination() {}

    public Vaccination(int AMKA_Citizen, int vaxDay, int vaxMonth, int vaxYear, int endDay, int endMonth, int endYear) {
        this.AMKA_Citizen = AMKA_Citizen;
        this.vaxDay = vaxDay;
        this.vaxMonth = vaxMonth;
        this.vaxYear = vaxYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public int getVax_id() {
        return AMKA_Citizen;
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
