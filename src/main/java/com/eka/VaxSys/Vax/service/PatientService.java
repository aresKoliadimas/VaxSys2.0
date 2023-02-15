package com.eka.VaxSys.Vax.service;

import com.eka.VaxSys.Vax.model.Patient;
import com.eka.VaxSys.Vax.model.Timeslot;
import com.eka.VaxSys.Vax.repositories.PatientRepository;
import com.eka.VaxSys.Vax.repositories.TimeslotRepository;
import com.eka.VaxSys.Vax.dtos.BookingDTO;
import com.eka.VaxSys.Vax.model.Appointment;
import com.eka.VaxSys.Vax.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final TimeslotRepository timeslotRepository;

    private final AppointmentRepository appointmentRepository;

    private final PatientRepository patientRepository;

    public PatientService(TimeslotRepository timeslotRepository, AppointmentRepository appointmentRepository, PatientRepository patientRepository) {
        this.timeslotRepository = timeslotRepository;
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
    }

    public List<Timeslot> getAvailableTimeslots(int day, int month, int year){
       return  timeslotRepository.findAllForGivenDate(day, month, year);
    }
    public Patient findById(Integer id){
       return  patientRepository.findById(id).get();
    }
    public boolean bookAppointment(BookingDTO bookingDTO){
        try {
            Appointment appointment = new Appointment();
            appointment.setPatient(bookingDTO.getPatient());
            appointment.setDoctor(bookingDTO.getDoctor());
            appointment.setVaxDate(bookingDTO.getTimeslot().getDate());
            bookingDTO.getTimeslot().setBooked(true);
            appointmentRepository.save(appointment);
            timeslotRepository.save(bookingDTO.getTimeslot());
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
