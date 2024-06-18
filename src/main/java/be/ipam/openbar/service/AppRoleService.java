package be.ipam.openbar.service;

import be.ipam.openbar.model.AppRole;
import be.ipam.openbar.repository.AppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AppRoleService {
    @Autowired
    private AppRoleRepository appRoleRepository;

    public AppRole getRoleByRoleName(String roleName) {
        return appRoleRepository.findByRoleName(roleName);
    }

    public AppRole getRoleById(UUID id) {
        return appRoleRepository.findById(id).orElseThrow();
    }

    public AppRole save(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }
}
