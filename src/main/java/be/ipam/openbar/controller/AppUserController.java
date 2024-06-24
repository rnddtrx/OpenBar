package be.ipam.openbar.controller;

import be.ipam.openbar.dto.AppUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.ipam.openbar.service.AppUserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/appuser")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    //create user
    @PostMapping("/appuser")
    public AppUserDto createUser(@RequestBody AppUserDto appUserDto) {
                return appUserService.addUser(appUserDto);
    }

    //get user by id
    @PostMapping(path ="/appuser", params = "id")
    public AppUserDto getUserById(UUID id) {
        return appUserService.getUserById(id);
    }

    //get all users
    @PostMapping("/appusers")
    public List<AppUserDto> getAllUsers() {
        return (List<AppUserDto>) appUserService.getAllUsers();
    }
}
