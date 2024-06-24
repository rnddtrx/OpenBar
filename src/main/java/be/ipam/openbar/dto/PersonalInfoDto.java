package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.PeronalInfo}
 */
@Value
public class PersonalInfoDto implements Serializable {
    UUID id;
    int notation;
    String comment;
    boolean isFavorite;
    RecipeDto recipe;
    AppUserDto appUser;
}