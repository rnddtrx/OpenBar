package be.ipam.openbar.controller;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import be.ipam.openbar.dto.PersonalInfoDto;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/personalinfo")
public class PersonalInfoController {
    @Autowired
    PersonalInfoService personalInfoService;
    // get all personal by user id
    @GetMapping("/personalinfos")
    public List<PersonalInfoDto> getAllPersonalInfos(@RequestBody  AppUserDto appUser){
        return personalInfoService.getAllPersonalInfos(appUser);
    }
    //save personal info
    @PostMapping("/personalinfo")
    public PersonalInfoDto savePersonalInfo(@RequestBody PersonalInfoDto personalInfoDto) {
        return personalInfoService.savePersonalInfo(personalInfoDto);
    }
    @GetMapping("/personalinfo")
    public PersonalInfoDto getPersonalInfoById(@RequestParam UUID id) {
        return personalInfoService.getPersonalInfoById(id);
    }
}
