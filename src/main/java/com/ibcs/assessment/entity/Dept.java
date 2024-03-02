package com.ibcs.assessment.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DEPT")
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 35, nullable = false)
    private String name;

    @Column(name = "IS_ACTIVE")
    private Boolean active;

}