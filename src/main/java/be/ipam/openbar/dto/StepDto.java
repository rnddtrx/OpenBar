package be.ipam.openbar.dto;

import be.ipam.openbar.model.Step;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link be.ipam.openbar.model.Step}
 */
@Value
public class StepDto implements Serializable {
    UUID id;
    String description;
    boolean firstStep;
    boolean lastStep;
    Step nextStep;
}