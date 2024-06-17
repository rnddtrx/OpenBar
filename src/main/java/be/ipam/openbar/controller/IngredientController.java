package be.ipam.openbar.controller;

import be.ipam.openbar.dto.IngredientDto;
import be.ipam.openbar.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ingredient")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    //get ingredient by id
    @GetMapping(path = "/ingredient", params = "id")
    public IngredientDto getIngredientById(UUID id) {
        return ingredientService.getIngredientById(id);
    }

    //get ingredient by name
    @GetMapping(path = "/ingredient", params = "name")
    public IngredientDto getIngredientByName(String name) {
        return ingredientService.getIngredientByName(name);
    }

    //search ingredient by name
    @GetMapping(path = "/ingredient", params = "search")
    public List<IngredientDto> searchIngredientByName(String search) {
        return ingredientService.searchIngredientByName(search);
    }

    //save ingredient
    @PostMapping("/ingredient")
    public IngredientDto saveIngredient(@RequestBody IngredientDto ingredientDto) {
        return ingredientService.saveIngredient(ingredientDto);
    }
}
