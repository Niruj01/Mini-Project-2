package com.springBoot.hospitalManagement.Repository;

import com.springBoot.hospitalManagement.Entity.Appointment;
import com.springBoot.hospitalManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
