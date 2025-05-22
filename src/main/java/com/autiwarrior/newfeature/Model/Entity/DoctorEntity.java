package com.autiwarrior.newfeature.Model.Entity;

import com.autiwarrior.newfeature.Model.Dto.DoctorReqDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Builder
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctors")
public class DoctorEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String username;
    @Column(name = "full_name")
    private  String fullName;
    private  String email;
    private  String password;


// this way is not good enough because we should use mapper 
    public static DoctorEntity toEntity(DoctorReqDto doctorReqDto){
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setUsername(doctorReqDto.getUsername());
        doctorEntity.setEmail(doctorReqDto.getEmail());
        doctorEntity.setFullName(doctorReqDto.getFullName());
        doctorEntity.setPassword(doctorReqDto.getPassword());
        return doctorEntity;

    }

}
