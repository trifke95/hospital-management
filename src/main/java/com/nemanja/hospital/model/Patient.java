package com.nemanja.hospital.model;

public class Patient extends User {
    private MedicalRecord medicalRecord;

    public Patient(String firstName, String lastName, String username, String passwdord, MedicalRecord  medicalRecord) {
        super(firstName, lastName, username, passwdord);
        this.medicalRecord = medicalRecord;
    }


}
