package be.ipam.openbar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
public class AppUser {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private boolean enabled;
    @OneToMany
    private List<AppRole> appRoles;
}