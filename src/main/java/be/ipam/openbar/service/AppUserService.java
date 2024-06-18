package be.ipam.openbar.service;

import be.ipam.openbar.dto.AppUserDto;
import be.ipam.openbar.mapper.AppUserMapper;
import be.ipam.openbar.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private AppUserMapper appUserMapper;

    //Get user by id
    public AppUserDto getUserById(UUID id) {
        return appUserMapper.toDto(appUserRepository.findById(id).orElseThrow());
    }

    //Get user by username
    public AppUserDto getUserByUsername(String username) {
        return appUserMapper.toDto(appUserRepository.findByUsername(username));
    }

    //add user
    public AppUserDto addUser(AppUserDto appUserDto) {
        return appUserMapper.toDto(appUserRepository.save(appUserMapper.toEntity(appUserDto)));
    }

    //get all users
    public Iterable<AppUserDto> getAllUsers() {
        return appUserRepository.findAll().stream().map(appUserMapper::toDto).collect(Collectors.toList());
    }

    //get paged users
    public Page<AppUserDto> getPagedUsers(Pageable pageable) {
        return appUserRepository.findAll(pageable).map(appUserMapper::toDto);
    }


}
