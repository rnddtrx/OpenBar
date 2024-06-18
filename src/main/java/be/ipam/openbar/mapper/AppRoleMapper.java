package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.AppRoleDto;
import be.ipam.openbar.model.AppRole;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppRoleMapper {

    AppRole toEntity(AppRoleDto appRoleDto);

    AppRoleDto toDto1(AppRole appRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AppRole partialUpdate(AppRoleDto appRoleDto, @MappingTarget AppRole appRole);
}