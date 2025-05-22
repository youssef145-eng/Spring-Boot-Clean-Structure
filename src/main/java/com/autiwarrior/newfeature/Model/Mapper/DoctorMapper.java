package com.autiwarrior.newfeature.Model.Mapper;

import com.autiwarrior.newfeature.Model.Dto.DoctorReqDto;
import com.autiwarrior.newfeature.Model.Dto.DoctorResDto;
import com.autiwarrior.newfeature.Model.Entity.DoctorEntity;
import org.springframework.stereotype.Service;

@Service
public interface DoctorMapper {
    public DoctorEntity toEntity(DoctorReqDto doctordto);
    public DoctorResDto toDto(DoctorEntity doctorEntity);
}
