package com.eka.VaxSys.Vax.service;

import com.eka.VaxSys.Vax.model.Appointment;
import com.eka.VaxSys.Vax.model.Patient;
import com.eka.VaxSys.Vax.repositories.AppointmentRepository;
import com.eka.VaxSys.Vax.repositories.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final AppointmentRepository appointmentRepository;



    public DoctorService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;

    }

    public boolean verifyVaccination(Patient patient){
        try {Appointment verifiedAppointment = appointmentRepository.findByPatient(patient);
        verifiedAppointment.setExpirationDate(verifiedAppointment.getVaxDate().plusMonths(6));
        verifiedAppointment.setVerifiedByDoc(true);
        appointmentRepository.save(verifiedAppointment);
        return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
