package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class PeronalInfo {
    @Id
    @GeneratedValue
    private UUID id;

}