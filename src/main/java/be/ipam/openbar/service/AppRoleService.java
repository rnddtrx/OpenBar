package be.ipam.openbar.service;

import be.ipam.openbar.dto.AppRoleDto;
import be.ipam.openbar.mapper.AppRoleMapper;
import be.ipam.openbar.model.AppRole;
import be.ipam.openbar.repository.AppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AppRoleService {
    @Autowired
    private AppRoleRepository appRoleRepository;
    @Autowired
    private AppRoleMapper appRoleMapper;

    public AppRole getRoleByRoleName(String roleName) {
        return appRoleRepository.findByRoleName(roleName);
    }

    public AppRole getRoleById(UUID id) {
        return appRoleRepository.findById(id).orElseThrow();
    }

    public AppRole save(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    public List<AppRoleDto> getAllRoles() {
        return appRoleRepository.findAll().stream().map(appRoleMapper::toDto1).collect(Collectors.toList());
    }
}
