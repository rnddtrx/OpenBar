package be.ipam.openbar.service;

import be.ipam.openbar.dto.RecipeDto;
import be.ipam.openbar.mapper.RecipeMapper;
import be.ipam.openbar.model.Recipe;
import be.ipam.openbar.repository.QuantityRepository;
import be.ipam.openbar.repository.RecipeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private RecipeMapper recipeMapper;
    @Autowired
    private QuantityRepository quantityRepository;
    @Autowired
    private QuantityService quantityService;
    @Autowired
    private StepService stepService;

    //Get recipe by id
    public RecipeDto getRecipeById(UUID id) {
        return recipeMapper.toDto(recipeRepository.findById(id).orElseThrow());
    }

    //Save recipe
    // Transactional annotation is used to perform a transaction on the method.
    // So if the method fails, the transaction will be rolled back.
    @Transactional
    public RecipeDto saveRecipe(RecipeDto recipeDto) {
        Recipe newRecipe = recipeMapper.toEntity(recipeDto);
        // Before saving the recipe, we need to save the quantities or else will get a transient object exception.
        // A transient object is an object that has just been instantiated and is not associated with a Hibernate session.
        // To make it persistent, we need to associate it with a session.
        // We can do this by saving the quantities first.
        quantityService.saveAllQuantities(newRecipe.getQuantities());
        // We also need to save the steps.
        stepService.saveAllSteps(newRecipe.getSteps());
        // Now we can save the recipe.
        return recipeMapper.toDto(recipeRepository.save(newRecipe));
    }

    //Get all recipes with pagination
    public Page<RecipeDto> getAllRecipes(Pageable pageable) {
        return recipeRepository.findAll(pageable).map(recipeMapper::toDto);
    }
}
