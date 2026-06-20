package com.nemanja.hospital.service;

import com.nemanja.hospital.model.Administrator;
import com.nemanja.hospital.model.Hospital;

public class AdministratorService {
    private Administrator administrator;
    private Hospital hospital;

    public AdministratorService(Administrator administrator, Hospital hospital) {
        this.administrator = administrator;
        this.hospital = hospital;
    }
}
