package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String image;
    @OneToMany
    private List<Step> steps;
    @OneToMany
    private List<Quantity> quantities;
    @OneToMany
    private List<Comment> comments;
}
