package com.nemanja.hospital.model;

public class Doctor extends User {
    private String specialty;

    public Doctor(String firstName, String lastName, String username, String password, String specialty) {
        super(firstName, lastName, username, password);
        this.specialty = specialty;
    }

}
