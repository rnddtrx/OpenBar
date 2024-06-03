package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.Ingredient}
 */
@Value
public class IngredientDto implements Serializable {
    UUID id;
    String name;
}