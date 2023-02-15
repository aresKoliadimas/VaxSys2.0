package com.eka.VaxSys.Vax.controller;

import com.eka.VaxSys.Vax.service.DoctorService;
import com.eka.VaxSys.Vax.service.PatientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/doctor")
public class DoctorController {

private final DoctorService doctorService;

private final PatientService patientService;

    public DoctorController(DoctorService doctorService, PatientService patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    @PutMapping("/{patientId}")
    public boolean verifyVaccination(@PathVariable Integer patientId){
        try {
            doctorService.verifyVaccination(patientService.findById(patientId));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
