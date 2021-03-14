package com.clusus.payroll.application.config.employee.dataloader;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties("role")
public class RoleDataWrapper {

    private List<String> names;
}
