package be.ipam.openbar.config;

import be.ipam.openbar.model.AppRole;
import be.ipam.openbar.service.AppRoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    //Intialize the roles at the start of the application if they don't exist
    @Bean
    public CommandLineRunner loadData(AppRoleService appRoleService) {
        return args -> {
            if (appRoleService.getRoleByRoleName("ADMIN") == null) {
                appRoleService.save(new AppRole(null,"ADMIN"));
            }
            if (appRoleService.getRoleByRoleName("USER") == null) {
                appRoleService.save(new AppRole(null,"USER"));
            }
        };
    }
}
