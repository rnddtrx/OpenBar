package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.RecipeDto;
import be.ipam.openbar.model.Recipe;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RecipeMapper {
    Recipe toEntity(RecipeDto recipeDto);

    RecipeDto toDto(Recipe recipe);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Recipe partialUpdate(RecipeDto recipeDto, @MappingTarget Recipe recipe);
}