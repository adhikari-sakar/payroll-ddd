package com.clusus.payroll.application.config.employee.dataloader;

import com.clusus.payroll.employee.domain.builder.RoleBuilder;
import com.clusus.payroll.employee.domain.entity.Role;
import com.clusus.payroll.employee.domain.model.RoleModel;
import com.clusus.payroll.employee.domain.repository.RoleRepository;
import com.clusus.payroll.employee.domain.valueobject.RoleId;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class RoleDataLoader {

    private final RoleDataWrapper wrapper;
    private final RoleRepository repository;

    @PostConstruct
    public void loadData() {
        getRoles().forEach(this::load);
    }

    private void load(Role role) {
        repository.findByName(role.getName())
                .ifPresentOrElse(existing -> update(existing, role), () -> add(role));
    }

    private void update(Role existing, Role updated) {
        existing.assign(updated.getName());
        repository.persist(existing);
    }

    private void add(Role role) {
        Role newRole = new Role(role.getId());
        newRole.assign(role.getName());
        repository.persist(newRole);
    }

    private List<Role> getRoles() {
        return wrapper.getNames().stream().map(this::toRole).collect(Collectors.toList());
    }

    private Role toRole(String name) {
        return new RoleBuilder().build(RoleModel.of(name));
    }

}
