package be.ipam.openbar.service;

import be.ipam.openbar.dto.IngredientDto;
import be.ipam.openbar.mapper.IngredientMapper;
import be.ipam.openbar.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private IngredientMapper ingredientMapper;

    //get ingredient by id
    public IngredientDto getIngredientById(UUID id) {
        return ingredientMapper.toDto(ingredientRepository.findById(id).orElseThrow());
    }

    //get ingredient by name
    public IngredientDto getIngredientByName(String name) {
        return ingredientMapper.toDto(ingredientRepository.findByName(name));
    }

    //save ingredient
    public IngredientDto saveIngredient(IngredientDto ingredientDto) {
        return ingredientMapper.toDto(ingredientRepository.save(ingredientMapper.toEntity(ingredientDto)));
    }
}
