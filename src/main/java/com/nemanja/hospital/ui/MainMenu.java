package com.nemanja.hospital.ui;

import com.nemanja.hospital.model.Administrator;
import com.nemanja.hospital.model.Hospital;
import com.nemanja.hospital.model.User;
import com.nemanja.hospital.service.AuthService;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;
    private Hospital hospital;
    private AuthService authService;


    public MainMenu (Scanner scanner) {

        this.scanner = scanner;
        this.hospital = new Hospital("Bolnica");
        this.authService = new AuthService(this.hospital);


    }


    public void start() {
        printMenu();
    }



    public void printMenu() {
        while (true) {
            System.out.println(" ");
            System.out.println("Dobrodosli u glavni meni bolnice: ");
            System.out.println(" ");
            System.out.println("1. Ulogujte se");
            System.out.println("2. Izlazak iz aplikacije");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                printMenuLogin();
            } else if (input.equals("2")) {
                System.out.println(" ");
                System.out.println("Ovim izlazite iz aplikacije. Da li ste sigurni? Pritisnite 1 ili d(da) da potvrdite, ili bilo koje dugme za povratak u glavni meni");
                String exit = scanner.nextLine().toLowerCase();
                if (List.of("1", "d", "da").contains(exit)) {
                    System.out.println("Odjavljivanje...");
                    break;
                }
                System.out.println(" ");
            } else {
                System.out.println("Pogresan unos! Unesite 1 da se ulogujete u aplikaciju, 2 za izlazak iz aplikacije.");
            }
        }

    }

    private void printMenuLogin() {
        System.out.println(" ");
        System.out.println("Dobrodosli u login meni bolnice: ");
        System.out.println(" ");
        System.out.println("1. Username: ");
        String username = scanner.nextLine();
        System.out.println("2. Password: ");
        String password = scanner.nextLine();
        // TODO make authentication of login
        Administrator user = new Administrator("Nemanja", "Trifkovic", "trifke", "trifke"); // hardcoded check
        this.hospital.addUser(user);
        User loginUser = this.hospital.findUserByUsername(username);
        if (authService.login(loginUser.getUsername(), loginUser.getPassword())) {
            System.out.println("Uspijesna prijava!");
            System.out.println("Ucitava se meni korisnika....");
            // TODO load contextual Menu
        } else {
            System.out.println("Neuspijesna prijava!");
        }

    }



}
