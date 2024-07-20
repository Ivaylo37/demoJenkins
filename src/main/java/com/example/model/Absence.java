package com.example.model;

import java.time.LocalDate;

import com.example.model.enums.AbsenceStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity(name = "absence_request_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private LocalDate fromDate;
    private LocalDate toDate;

    @Enumerated(EnumType.STRING)
    private AbsenceStatus status;




}