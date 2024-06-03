package be.ipam.openbar.repository;

import be.ipam.openbar.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {
    //get ingredient by name
    Ingredient findByName(String name);
}