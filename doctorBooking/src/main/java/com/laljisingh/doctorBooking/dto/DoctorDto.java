package com.laljisingh.doctorBooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoctorDto {
    private String name;
    @Min(5)
    @NotNull(message = "city not null")
    private String city;
    @Email(message = "correct email")
    @NotNull(message = "email not null")
    @NotBlank(message = "email not blank")
    private String email;
    @Min(value = 10, message = "Phone should be 10 digit")
    private String phoneNumber;
    @NotNull(message = "speciaty not null")
    private String speciality;
}
