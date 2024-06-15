package com.springBoot.hospitalManagement.Service;

import com.springBoot.hospitalManagement.Entity.Doctor;
import com.springBoot.hospitalManagement.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepo;


    public List<Doctor> displayAll(){

        return doctorRepo.findAll();
    }


    public Doctor findDoctorById(int id) {
        Optional<Doctor> doctorid = doctorRepo.findById(id);
        if(doctorid.isPresent()){
            return doctorid.get();
        }else{
            throw new RuntimeException("Doctor not found with id: " + id);
        }

    }

}
