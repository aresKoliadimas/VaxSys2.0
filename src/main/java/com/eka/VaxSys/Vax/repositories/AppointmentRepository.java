package com.eka.VaxSys.Vax.repositories;

import com.eka.VaxSys.Vax.model.Appointment;
import com.eka.VaxSys.Vax.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    Appointment findByPatient(Patient patient);
}
