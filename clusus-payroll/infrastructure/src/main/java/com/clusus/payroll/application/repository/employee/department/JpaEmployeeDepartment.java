package com.clusus.payroll.application.repository.employee.department;

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
@Table(name = "EMPLOYEE_DEPARTMENT", indexes = {@Index(name = "IDX_DEPARTMENT_NAME", columnList = "name", unique = true)})
@EqualsAndHashCode(callSuper = true)
public class JpaEmployeeDepartment extends JpaEntity {
    private String name;
}
