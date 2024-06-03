package be.ipam.openbar.mapper;

import be.ipam.openbar.model.AppRole;
import be.ipam.openbar.dto.RoleDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppRoleMapper {
    AppRole toEntity(RoleDto roleDto);

    RoleDto toDto(AppRole appRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AppRole partialUpdate(RoleDto roleDto, @MappingTarget AppRole appRole);
}