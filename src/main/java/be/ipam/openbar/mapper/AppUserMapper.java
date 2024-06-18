package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.model.AppUser;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {AppRoleMapper.class})
public interface AppUserMapper {
    AppUser toEntity(AppUserDto appUserDto);

    AppUserDto toDto(AppUser appUser);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AppUser partialUpdate(AppUserDto appUserDto, @MappingTarget AppUser appUser);
}