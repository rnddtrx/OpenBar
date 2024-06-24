package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class PersonalInfo {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private int notation;
    @Column
    private String comment;
    @Column
    private boolean isFavorite;
    @OneToOne
    private Recipe recipe;
    @OneToOne
    private AppUser appUser;

}