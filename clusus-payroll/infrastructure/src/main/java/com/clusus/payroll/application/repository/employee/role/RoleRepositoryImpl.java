package com.clusus.payroll.application.repository.employee.role;

import com.clusus.payroll.application.mapper.RoleMapper;
import com.clusus.payroll.employee.domain.builder.RoleBuilder;
import com.clusus.payroll.employee.domain.entity.Role;
import com.clusus.payroll.employee.domain.model.RoleModel;
import com.clusus.payroll.employee.domain.repository.RoleRepository;
import com.clusus.payroll.employee.domain.valueobject.RoleId;
import com.clusus.payroll.employee.domain.valueobject.RoleName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RoleRepositoryImpl implements RoleRepository {
    private final RoleMapper mapper;
    private final RoleJpaRepository jpaRepository;

    @Override
    public void persist(Role team) {
        jpaRepository.save(mapper.toEntity(new RoleBuilder().build(team)));
    }

    @Override
    public Optional<Role> findByRoleId(RoleId id) {
        return Optional.ofNullable(new RoleBuilder()
                .build(jpaRepository.findById(id.getValue())
                        .map(mapper::toModel).orElse(null)));
    }

    @Override
    public Optional<Role> findByName(RoleName name) {
        RoleModel model = jpaRepository.findByName(name.getValue()).map(mapper::toModel).orElse(null);
        Role role = new RoleBuilder().build(model);
        return Optional.ofNullable(role);
    }
}
