package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.AppRole}
 */
@Value
public class AppRoleDto implements Serializable {
    UUID id;
    String roleName;
}