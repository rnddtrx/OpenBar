package be.ipam.openbar.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.Quantity}
 */
@Value
public class QuantityDto implements Serializable {
    UUID id;
    double quantity;
    String unit;
    IngredientDto ingredient;
}