package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class Ingredient {
    @Id
    @GeneratedValue
    @Column
    private UUID id;
    //set unique constraint
    @Column(unique = true)
    private String name;
}