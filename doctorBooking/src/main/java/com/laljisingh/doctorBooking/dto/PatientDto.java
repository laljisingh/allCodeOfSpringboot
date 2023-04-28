package com.laljisingh.doctorBooking.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDto {
    @NotBlank(message = "name not blank")
    @NotNull(message = "name not null")
    private String name;
    @NotBlank(message = "city not blank")
    @NotNull(message = "city not null")
    private String city;
    @NotBlank(message = "symptom not blank")
    @NotNull(message = "symptom not null")
    private String symptom;
    @NotBlank(message = "email not blank")
    @Email(message = "email not null")
    private String email;
    @Min(value = 10, message = "phone must be 10 diigit")
    @NotBlank(message = "phone not blank")
    @NotNull(message = "phone not null")
    private String phone;
    private Integer doctorId;
}
