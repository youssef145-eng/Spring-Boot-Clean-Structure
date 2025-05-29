package com.autiwarrior.newfeature.Model.Mapper.impl;

import com.autiwarrior.newfeature.Model.Dto.DoctorReqDto;
import com.autiwarrior.newfeature.Model.Dto.DoctorResDto;
import com.autiwarrior.newfeature.Model.Entity.DoctorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorEntity toEntity(DoctorReqDto dto);

    DoctorResDto toDto(DoctorEntity entity);
}
