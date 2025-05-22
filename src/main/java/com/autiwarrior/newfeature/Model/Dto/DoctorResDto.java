package com.autiwarrior.newfeature.Model.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DoctorResDto {
    private String fullName;
    private String email;
}
