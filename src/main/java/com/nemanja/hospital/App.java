package com.nemanja.hospital;


import com.nemanja.hospital.model.*;
import com.nemanja.hospital.service.AuthService;
import com.nemanja.hospital.ui.MainMenu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("Bolnica");
        AuthService authService = new AuthService(hospital);

        MainMenu mainMenu = new MainMenu(scanner, hospital, authService);
        Administrator administrator = new Administrator("Nemanja", "Trifovic", "trifke", "sifra123");
        Doctor doctor = new Doctor("Mile", "Trifovic", "strikan", "strikan123", "Kardiolog");
        Patient patient = new Patient("Pero", "Peric", "rope", "rope123", new MedicalRecord("000"));
        mainMenu.addTestUser(administrator);
        mainMenu.addTestUser(doctor);
        mainMenu.addTestUser(patient);

        mainMenu.start();
    }
}
