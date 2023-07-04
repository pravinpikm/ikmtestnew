package com.example.demo.modal;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="demo")



public class domoModal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="emp_id")
    private int empid;

    @NotEmpty
    @Column(name="emp_name")
    private String name;

    @NotEmpty
    @Column(name="emp_desig")
    private String designation;

    @Column(name="emp_phone")
    private String phone;

    @Past
    @Column(name="emp_dob")
    private Date dateOfBirth;
}
