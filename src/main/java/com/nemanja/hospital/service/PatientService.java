package com.nemanja.hospital.service;

import com.nemanja.hospital.model.Hospital;
import com.nemanja.hospital.model.Patient;

public class PatientService {
    private Hospital hospital;
    private Patient patient;

    public PatientService(Hospital hospital, Patient patient) {
        this.hospital = hospital;
        this.patient = patient;
    }




}
