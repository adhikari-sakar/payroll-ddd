package com.clusus.payroll.application.mapper;

import com.clusus.payroll.application.repository.employee.team.JpaEmployeeTeam;
import com.clusus.payroll.employee.domain.model.TeamModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamModel toModel(JpaEmployeeTeam jpaTeam);

    JpaEmployeeTeam toEntity(TeamModel teamModel);

}
