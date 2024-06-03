package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.IngredientDto;
import be.ipam.openbar.model.Ingredient;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IngredientMapper {
    Ingredient toEntity(IngredientDto ingredientDto);

    IngredientDto toDto(Ingredient ingredient);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Ingredient partialUpdate(IngredientDto ingredientDto, @MappingTarget Ingredient ingredient);
}