package com.ibcs.assessment.dto;

import com.ibcs.assessment.entity.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmpDto {

    private Long id;

    private String code;

    private String name;

    private String mobile;

    private LocalDate dob;

    private Gender gender;

    private Long deptId;

    private Boolean active;

}
