package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.StepDto;
import be.ipam.openbar.model.Step;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StepMapper {
    Step toEntity(StepDto stepDto);

    StepDto toDto(Step step);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Step partialUpdate(StepDto stepDto, @MappingTarget Step step);
}