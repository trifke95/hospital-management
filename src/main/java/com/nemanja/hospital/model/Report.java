package com.nemanja.hospital.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Report implements Document{
    private LocalDate date;
    private boolean isCertified;
    private Hospital hospital;
    private Patient patient;
    private Doctor doctor;
    private ArrayList<Diagnosis> diagnosis;



    private void setCertified(boolean isCertified){
        this.isCertified = isCertified;
    }

    public boolean isCertified() {
        return isCertified;
    }

    public void print(){}

    public void certificate(){}

}
