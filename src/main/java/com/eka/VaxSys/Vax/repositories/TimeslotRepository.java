package com.eka.VaxSys.Vax.repositories;

import com.eka.VaxSys.Vax.model.Appointment;
import com.eka.VaxSys.Vax.model.Timeslot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimeslotRepository extends JpaRepository<Timeslot, Integer> {

    @Query(value = "select t from timeslot t where t.tDay = :day and t.tMonth = :month and t.tYear = :year and t.booked = false", nativeQuery = true)
     List<Timeslot> findAllForGivenDate(int day, int month, int year);
}
