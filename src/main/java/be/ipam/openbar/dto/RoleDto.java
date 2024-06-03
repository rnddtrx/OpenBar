package be.ipam.openbar.dto;

import be.ipam.openbar.model.AppRole;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link AppRole}
 */
@Value
public class RoleDto implements Serializable {
    UUID id;
    String roleName;
}