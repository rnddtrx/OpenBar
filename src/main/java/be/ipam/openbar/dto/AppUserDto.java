package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.AppUser}
 */
@Value
public class AppUserDto implements Serializable {
    UUID id;
    String username;
    String email;
    String firstName;
    String lastName;
    RoleDto appRoles;
}