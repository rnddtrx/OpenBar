package be.ipam.openbar.controller;

import be.ipam.openbar.dto.RecipeDto;
import be.ipam.openbar.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    //Get recipe by id
    @GetMapping(path = "/recipe", params = "id")
    public RecipeDto getRecipeById(UUID id) {
        return recipeService.getRecipeById(id);
    }

    //Get all recipes with pagination
    @GetMapping("/recipes")
    public Page<RecipeDto> getAllRecipes(Pageable pageable) {
        return recipeService.getAllRecipes(pageable);
    }

    //Save recipe
    @PostMapping("/recipe")
    public RecipeDto saveRecipe(@RequestBody RecipeDto recipeDto) {
        return recipeService.saveRecipe(recipeDto);
    }
}
