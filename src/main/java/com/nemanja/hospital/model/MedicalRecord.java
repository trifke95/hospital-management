package com.nemanja.hospital.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class MedicalRecord {
    private String iD;
    private LocalDate expiryDate;
    private ArrayList<Appointment> appointments;


    public MedicalRecord(String iD) {
        this.iD = iD;
        this.expiryDate = LocalDate.now().plusYears(1) ;
        appointments = new ArrayList<>();
    }



}
