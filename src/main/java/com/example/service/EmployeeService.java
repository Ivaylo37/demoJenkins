package com.example.service;

import com.example.model.Employee;
import com.example.model.dto.AbsenceRequestDto;
import com.example.model.dto.AbsenceResponseDto;
import com.example.model.dto.EmployeeRequestDto;
import com.example.model.dto.EmployeeResponseDto;

public interface EmployeeService {

    EmployeeResponseDto getEmployee(Long id);

    EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto);

    AbsenceResponseDto getAbsence(Long id);

    AbsenceResponseDto createAbsence(AbsenceRequestDto requestDto);

    void approveAbsence(Long id);

    void declineAbsence(Long id);

    EmployeeResponseDto toResponse(Employee employee);


}
