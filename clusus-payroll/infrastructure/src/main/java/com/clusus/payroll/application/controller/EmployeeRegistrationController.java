package com.clusus.payroll.application.controller;

import com.clusus.payroll.application.mapper.EmployeeMapper;
import com.clusus.payroll.application.service.RegistrationService;
import com.clusus.payroll.employee.registration.v1.api.EmployeeRegistrationApi;
import com.clusus.payroll.employee.registration.v1.request.CommonResponse;
import com.clusus.payroll.employee.registration.v1.request.EmployeeRegistrationRequest;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = {"EmployeeRegistration"})
public class EmployeeRegistrationController implements EmployeeRegistrationApi {

    private final EmployeeMapper mapper;
    private final RegistrationService service;

    @Override
    public ResponseEntity<CommonResponse> registerEmployee(EmployeeRegistrationRequest request) {
        try {
            service.register(mapper.toModel(request));
            return ResponseEntity.ok().body(new CommonResponse());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new CommonResponse());
        }
    }
}
