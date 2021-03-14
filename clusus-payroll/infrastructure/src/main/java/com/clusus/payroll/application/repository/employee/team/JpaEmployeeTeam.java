package com.clusus.payroll.application.repository.employee.team;

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
@Table(name = "EMPLOYEE_TEAM", indexes = {@Index(name = "IDX_TEAM_NAME", columnList = "name", unique = true)})
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
public class JpaEmployeeTeam extends JpaEntity {
    private String name;
}

