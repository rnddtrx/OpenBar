package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Step {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String description;
    @Column
    boolean firstStep;
    @Column
    boolean lastStep;
    @OneToOne
    private Step nextStep;
}