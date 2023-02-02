package com.eka.VaxSys.Vax;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class VaxCenter {

    @Id
    int id_center;
    String address;
    @OneToMany(mappedBy="slot_id", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    List<Timeslot> timeslot = new ArrayList<Timeslot>();

    public VaxCenter(int id_center, String address) {
        this.id_center = id_center;
        this.address = address;
    }

    public int getId_center() {
        return id_center;
    }

    public String getAddress() {
        return address;
    }
    public List<Timeslot> getTimeslot() {
        return timeslot;
    }
}

