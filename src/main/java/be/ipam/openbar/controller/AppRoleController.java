package be.ipam.openbar.controller;

import be.ipam.openbar.dto.AppRoleDto;
import be.ipam.openbar.service.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Relation;
import java.util.List;

@RestController
@RequestMapping("/api/approle")
public class AppRoleController {
    @Autowired
    AppRoleService appRoleService;
    // get all roles
    @RequestMapping("/approles")
    public List<AppRoleDto> getAllRoles(){
        return appRoleService.getAllRoles();
    }
}
