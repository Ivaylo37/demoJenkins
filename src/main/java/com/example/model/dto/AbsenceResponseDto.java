package com.example.model.dto;

import com.example.model.enums.AbsenceStatus;
import com.sun.istack.NotNull;

import java.time.LocalDate;

public class AbsenceResponseDto {

    @NotNull
    String employeeName;

    @NotNull
    private LocalDate fromDate;
    @NotNull
    private LocalDate toDate;

    @NotNull
    private AbsenceStatus status;

}
