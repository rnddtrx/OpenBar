package be.ipam.openbar.controller;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.ipam.openbar.dto.PersonalInfoDto;

import java.util.List;

@RestController
@RequestMapping("/api/personalinfo")
public class PersonalInfoController {
    @Autowired
    PersonalInfoService personalInfoService;
    // get all personal by user id
    @RequestMapping("/personalinfos")
    public List<PersonalInfoDto> getAllPersonalInfos(AppUserDto appuser){
        return personalInfoService.getAllPersonalInfos(appuser);
    }

}
