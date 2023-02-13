package com.eka.VaxSys.Vax.controller;

import com.eka.VaxSys.Vax.dtos.BookingDTO;
import com.eka.VaxSys.Vax.model.Appointment;
import com.eka.VaxSys.Vax.model.Patient;
import com.eka.VaxSys.Vax.model.Timeslot;
import com.eka.VaxSys.Vax.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/patient")
public class PatientController {

    private final PatientService patientService;


    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/list")
    public List<Timeslot> getAppointments(int day, int month, int year) {
        return patientService.getAvailableTimeslots(day,month,year);
    }

    @PutMapping("/book")
    public boolean bookAppointment(BookingDTO bookingDTO){
        try {
            patientService.bookAppointment(bookingDTO);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @GetMapping("/{id}")
    public Patient checkStatus(@PathVariable Integer patientId){
        return patientService.findById(patientId);
    }
}
