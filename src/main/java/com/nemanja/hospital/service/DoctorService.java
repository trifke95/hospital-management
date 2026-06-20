package com.nemanja.hospital.service;

import com.nemanja.hospital.model.Doctor;
import com.nemanja.hospital.model.Hospital;

public class DoctorService {
    private Doctor doctor;
    private Hospital hospital;

    public DoctorService(Doctor doctor, Hospital hospital) {
        this.doctor = doctor;
        this.hospital = hospital;
    }

}
