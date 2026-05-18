package com.nemanja.hospital;


import com.nemanja.hospital.ui.MainMenu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu(scanner);
        mainMenu.start();
    }
}
