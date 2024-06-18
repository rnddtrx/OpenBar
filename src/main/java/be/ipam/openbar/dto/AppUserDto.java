package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.AppUser}
 */
@Value
public class AppUserDto implements Serializable {
    UUID id;
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    boolean enabled;
    List<AppRoleDto> appRoles;
}