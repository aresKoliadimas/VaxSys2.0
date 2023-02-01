package com.eka.VaxSys.Vax;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

// Since this is the controller, it is the place where we add our end-points
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class VaxController {

	@Autowired
	private VaxService vs;

	@GetMapping(path = "/login")
	public List<Enduser> login() throws Exception {
		return vs.login();
	}

	@GetMapping(path = "/timeslots")
	public List<Timeslot> getAllTimeslots()  throws Exception{
		return vs.getAllTimeslots();
	}

	@PostMapping(path = "/addAppointment")
	public void addAppointment(@RequestBody Appointment a) throws Exception{
		vs.addAppointment(a);
	}

	@PostMapping(path = "/getVaxStatus/{amka}")
	public Optional<Vaccination> getVaxStatus(@PathVariable int amka) throws Exception {
		return vs.getVaxStatus(amka);
	}

}
