package com.nemanja.hospital.model;

import javax.print.Doc;
import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<User> korisnici;
    private ArrayList<Appointment> appointments;

    public Hospital(String name) {
        this.name = name;
        this.korisnici = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }


    public void addUser(User user) {
        this.korisnici.add(user);
    }

    public User findUserByUsername(String username) {
        for (User u : this.korisnici) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
}
