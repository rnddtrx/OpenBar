package be.ipam.openbar.controller;

import be.ipam.openbar.dto.AppUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.ipam.openbar.service.AppUserService;

import java.util.UUID;

@RestController
@RequestMapping("/api/appuser")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    //create user
    @PostMapping("/appuser")
    public AppUserDto createUser(AppUserDto appUserDto) {
        return appUserService.addUser(appUserDto);
    }

    //get user by id
    @PostMapping(path ="/appuser", params = "id")
    public AppUserDto getUserById(UUID id) {
        return appUserService.getUserById(id);
    }
}
