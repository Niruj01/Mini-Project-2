package com.springBoot.hospitalManagement.Repository;

import com.springBoot.hospitalManagement.Entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Integer> {
}
