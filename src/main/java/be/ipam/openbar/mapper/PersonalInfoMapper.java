package be.ipam.openbar.mapper;

import be.ipam.openbar.dto.PersonalInfoDto;
import be.ipam.openbar.model.PersonalInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {RecipeMapper.class, AppUserMapper.class})
public interface PersonalInfoMapper {
    PersonalInfo toEntity(PersonalInfoDto personalInfoDto);

    PersonalInfoDto toDto(PersonalInfo personalInfo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PersonalInfo partialUpdate(PersonalInfoDto personalInfoDto, @MappingTarget PersonalInfo personalInfo);
}