package com.clusus.payroll.application.repository.employee.role;

import com.clusus.payroll.application.repository.JpaEntity;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "EMPLOYEE_ROLE", indexes = {@Index(name = "IDX_ROLE_NAME", columnList = "name", unique = true)})
@EqualsAndHashCode(callSuper = true)
public class JpaEmployeeRole extends JpaEntity {
    private String name;
}
