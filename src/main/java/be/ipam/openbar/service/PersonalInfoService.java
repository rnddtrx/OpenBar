package be.ipam.openbar.service;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.dto.PersonalInfoDto;
import be.ipam.openbar.mapper.AppUserMapper;
import be.ipam.openbar.repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalInfoService {
    @Autowired
    private PersonalInfoRepository personalInfoRepository;
    @Autowired
    private AppUserMapper appUserMapper;

    // get all personal by user id
    public List<PersonalInfoDto> getAllPersonalInfos(AppUserDto appuser){
        return personalInfoRepository.findByAppUser(appUserMapper.toEntity(appuser));
    }
}
