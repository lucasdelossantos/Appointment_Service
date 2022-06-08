package com.ldls.appointment;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.ldls.appointment.AppointmentService.uuid;

public class AppointmentServiceTest {

    public LocalDate date = LocalDate.of(2023,10,31);
    @Test
    public void addAppointment(){
        System.out.println(date);
        System.out.println(uuid);
        Appointment a1 = new Appointment(uuid,"Halloween!",date);
        AppointmentService appointmentService = new AppointmentService();
        System.out.println(AppointmentService.addAppointment(a1));

    }
}
