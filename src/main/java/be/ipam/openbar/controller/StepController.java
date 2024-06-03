package be.ipam.openbar.controller;

import be.ipam.openbar.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/step")
public class StepController {
    @Autowired
    private StepService stepService;



}
