package com.nemanja.hospital.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appointment {
    private static final int DURATION = 20;
    private static final String TIME_UNIT = "minutes";
    private LocalDateTime dateAndTimeOfAppointment;
    private Patient patient;
    private Doctor doctor;
    private Report report;

    public Appointment(LocalDateTime dateAndTime,Patient patient , Doctor doctor, Report report) {
        this.patient = patient;
        this.doctor = doctor;
        this.report = report;
    }


}
