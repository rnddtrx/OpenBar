package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.QuantityDto;
import be.ipam.openbar.model.Quantity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {IngredientMapper.class})
public interface QuantityMapper {
    Quantity toEntity(QuantityDto quantityDto);

    QuantityDto toDto(Quantity quantity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Quantity partialUpdate(QuantityDto quantityDto, @MappingTarget Quantity quantity);
}