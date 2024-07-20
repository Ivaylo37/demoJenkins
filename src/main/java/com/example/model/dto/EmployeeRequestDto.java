package com.example.model.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeRequestDto {

    @NotNull
    private final String givenName;

    @NotNull
    private final String familyName;

    @NotNull
    private final String email;
}
