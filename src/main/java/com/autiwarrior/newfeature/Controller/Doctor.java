package com.autiwarrior.newfeature.Controller;

import com.autiwarrior.newfeature.Model.Dto.DoctorReqDto;
import com.autiwarrior.newfeature.Model.Dto.DoctorResDto;
import com.autiwarrior.newfeature.Model.Entity.DoctorEntity;
import com.autiwarrior.newfeature.Model.Mapper.impl.DoctorMapper;
import com.autiwarrior.newfeature.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class Doctor {
    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    DoctorEntity doctorEntity;
    @Autowired
    DoctorMapper doctorMapper;
    @GetMapping("/getDoctor")
  public String getDoctor(@RequestParam String name) {
      return name;

  }


    @GetMapping("/getDoctorpath/name/{name}")
    public String getDoctorpath(@PathVariable String name) {
        return name;

    }
    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody DoctorReqDto doctor) {
        System.out.println(doctor);

    }
    @PostMapping("/saveDoctor")
    public DoctorResDto SaveDoctor(@RequestBody DoctorReqDto doctor) {
        DoctorEntity doctor1=this.doctorMapper.toEntity(doctor);
        this.doctorRepo.save(doctor1);

        DoctorResDto doctorResDto=this.doctorMapper.toDto(doctor1);
        return doctorResDto;
    }


}
