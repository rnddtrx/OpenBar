package be.ipam.openbar.service;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.dto.PersonalInfoDto;
import be.ipam.openbar.mapper.AppUserMapper;
import be.ipam.openbar.mapper.PersonalInfoMapper;
import be.ipam.openbar.repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonalInfoService {
    @Autowired
    private PersonalInfoRepository personalInfoRepository;
    @Autowired
    private AppUserMapper appUserMapper;
    @Autowired
    private PersonalInfoMapper personalInfoMapper;

    // get all personal by user id
    public List<PersonalInfoDto> getAllPersonalInfos(AppUserDto appuser){
        return personalInfoRepository.findByAppUser(appUserMapper.toEntity(appuser));
    }

    //save personal info
    public PersonalInfoDto savePersonalInfo(PersonalInfoDto personalInfoDto) {
        return personalInfoMapper.toDto(personalInfoRepository.save(personalInfoMapper.toEntity(personalInfoDto)));
    }

    public PersonalInfoDto getPersonalInfoById(UUID id) {
        return personalInfoMapper.toDto(personalInfoRepository.findById(id).orElse(null));
    }
}
