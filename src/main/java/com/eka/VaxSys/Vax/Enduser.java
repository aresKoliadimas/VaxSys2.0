package com.eka.VaxSys.Vax;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enduser {
    @Id
    String username;
    String password;
    boolean isAdmin;

    public Enduser(){};

    public Enduser(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {return password;}

    public boolean isAdmin() {return isAdmin;}
}




