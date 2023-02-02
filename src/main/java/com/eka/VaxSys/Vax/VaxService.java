package com.eka.VaxSys.Vax;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaxService {

	@Autowired
	private TimeslotRepository timeslotRepository;
	@Autowired
	private EnduserRepository enduserRepository;
//	@Autowired
//	private AppointmentRepository appointmentRepository;
	@Autowired
	private VaccinationRepository vaccinationRepository;

	public List<Timeslot> getAllTimeslots() throws Exception {
		return timeslotRepository.findAll();
	}

	public List<Enduser> login() throws Exception {
		return enduserRepository.findAll();
	}

//	public void addAppointment(Appointment a) {
//		Optional<Appointment> byId = appointmentRepository.findById(a.getIdTimeslot());
//		if (!byId.isPresent()) appointmentRepository.save(a);
//	}

	public Optional<Vaccination> getVaxStatus(int amka) {
		return vaccinationRepository.findById(amka);
	}
}
