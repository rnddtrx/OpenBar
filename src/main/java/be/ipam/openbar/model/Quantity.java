package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Quantity {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private double quantity;
    @Column
    private String unit;
    @ManyToOne
    Ingredient ingredient;

}