package com.example.model.dto;

import com.example.model.enums.EmployeeRole;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeResponseDto {
    @NotNull
    private Long id;

    @NotNull
    private String givenName;

    @NotNull
    private String familyName;

    @NotNull
    private String email;
    @NotNull
    private EmployeeRole role;
}
