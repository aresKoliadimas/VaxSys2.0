package com.eka.VaxSys.Vax;

import java.util.*;

import com.eka.VaxSys.Vax.model.Enduser;
import com.eka.VaxSys.Vax.model.Timeslot;
import com.eka.VaxSys.Vax.repositories.TimeslotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaxService {

	@Autowired
	private TimeslotRepository timeslotRepository;
	@Autowired
	private EnduserRepository enduserRepository;

	public List<Timeslot> getAllTimeslots() throws Exception {
		return timeslotRepository.findAll();
	}

	public List<Enduser> login() throws Exception {
		return enduserRepository.findAll();
	}
}
