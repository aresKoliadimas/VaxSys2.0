package com.eka.VaxSys.Vax.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VaxCenter {

    @Id
    Integer id;

    String code;

    String address;

    @ManyToMany
    @JoinTable(name = "vaxcenter_timeslot",
    joinColumns = @JoinColumn(name = "vaxCenter_id"),
    inverseJoinColumns = @JoinColumn(name = "timeslot_id"))
    Set<Timeslot> timeslot;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Timeslot> getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Set<Timeslot> timeslot) {
        this.timeslot = timeslot;
    }
}
