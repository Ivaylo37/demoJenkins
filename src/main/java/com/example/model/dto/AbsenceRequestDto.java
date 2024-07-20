package com.example.model.dto;

import com.example.model.Employee;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class AbsenceRequestDto {

    @NotNull
    Employee employee;

    @NotNull
    LocalDate fromDate;

    @NotNull
    LocalDate toDate;
}
