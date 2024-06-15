package com.springBoot.hospitalManagement.Service;

import com.springBoot.hospitalManagement.Entity.Appointment;
import com.springBoot.hospitalManagement.Entity.User;
import com.springBoot.hospitalManagement.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository AppointmentRepo;

    public List<Appointment> DisplayAll(){
        return AppointmentRepo.findAll();
    }

    public void addAppointment(Appointment appointment){
        AppointmentRepo.save(appointment);
    }

}
