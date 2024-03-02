package com.ibcs.assessment.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "EMP")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 4, unique = true)
    private String code;

    @Column(length = 35, nullable = false)
    private String name;

    @Column(length = 14, nullable = false)
    private String mobile;

    @Column(name="DATE_OF_BIRTH")
    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    @Column(length = 6)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Dept dept;

    @Column(name = "IS_ACTIVE")
    private Boolean active;

}
