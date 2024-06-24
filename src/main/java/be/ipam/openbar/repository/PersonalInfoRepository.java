package be.ipam.openbar.repository;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.dto.PersonalInfoDto;
import be.ipam.openbar.model.AppUser;
import be.ipam.openbar.model.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, UUID> {
    List<PersonalInfoDto> findByAppUser(AppUser appUser);
}