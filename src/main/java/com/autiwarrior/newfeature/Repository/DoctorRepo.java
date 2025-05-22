package com.autiwarrior.newfeature.Repository;

import com.autiwarrior.newfeature.Controller.Doctor;
import com.autiwarrior.newfeature.Model.Entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<DoctorEntity,Integer> {

}
