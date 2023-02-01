package com.eka.VaxSys.Vax;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination, Integer> {
}
