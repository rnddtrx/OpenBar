package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.Recipe}
 */
@Value
public class RecipeDto implements Serializable {
    UUID id;
    String name;
    String description;
    String image;
    List<QuantityDto> quantities;
    List<StepDto> steps;
}