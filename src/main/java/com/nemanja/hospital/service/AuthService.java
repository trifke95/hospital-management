package com.nemanja.hospital.service;

import com.nemanja.hospital.model.Hospital;
import com.nemanja.hospital.model.User;

public class AuthService {
    private Hospital bolnica;


    public AuthService(Hospital bolnica) {
        this.bolnica = bolnica;
    }

    public boolean login(String username, String password) {
        User userToLogin = this.bolnica.findUserByUsername(username);
        if (userToLogin == null) {
            return false;
        }
        return userToLogin.getPassword().equals(password);
    }




}
