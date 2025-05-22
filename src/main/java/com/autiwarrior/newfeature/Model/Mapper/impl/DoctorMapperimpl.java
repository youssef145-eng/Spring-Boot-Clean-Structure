package com.autiwarrior.newfeature.Model.Mapper.impl;

import com.autiwarrior.newfeature.Model.Dto.DoctorReqDto;
import com.autiwarrior.newfeature.Model.Dto.DoctorResDto;
import com.autiwarrior.newfeature.Model.Entity.DoctorEntity;
import com.autiwarrior.newfeature.Model.Mapper.DoctorMapper;
import org.springframework.stereotype.Service;

import static com.autiwarrior.newfeature.Model.Dto.DoctorResDto.*;

@Service
public class DoctorMapperimpl implements DoctorMapper {
/*
    @Override
    public DoctorEntity toEntity(DoctorDto doctordto) {
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setUsername(doctordto.getUsername());
        doctorEntity.setEmail(doctordto.getEmail());
        doctorEntity.setFullName(doctordto.getFullName());
        doctorEntity.setPassword(doctordto.getPassword());
        return doctorEntity;    } */

    // here we make code simple using builder annotation in DoctorEntity
    @Override
    public DoctorEntity toEntity(DoctorReqDto doctorReqDto) {
return DoctorEntity.builder().
        username(doctorReqDto.getUsername()).
        email(doctorReqDto.getEmail()).
        fullName(doctorReqDto.getFullName()).
        password(doctorReqDto.getPassword()).build();
    }

    @Override
    public DoctorResDto toDto(DoctorEntity doctorEntity) {
       return builder().fullName(doctorEntity.getFullName()).
               email(doctorEntity.getEmail()).
               build();
    }
}
