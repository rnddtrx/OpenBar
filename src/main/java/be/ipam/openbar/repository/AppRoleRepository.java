package be.ipam.openbar.repository;

import be.ipam.openbar.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppRoleRepository extends JpaRepository<AppRole, UUID> {
    AppRole findByRoleName(String roleName);
}