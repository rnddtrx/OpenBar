package be.ipam.openbar.controller;

import be.ipam.openbar.dto.QuantityDto;
import be.ipam.openbar.service.QuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/quantity")
public class QuantityController {
    @Autowired
    private QuantityService quantityService;

    //get quantity by id
    @GetMapping(path = "/quantity", params = "id")
    public QuantityDto getQuantityById(UUID id) {
        return quantityService.getQuantityById(id);
    }

    //save quantity
    @PostMapping("/quantity")
    public QuantityDto saveQuantity(@RequestBody QuantityDto quantityDto) {
        return quantityService.saveQuantity(quantityDto);
    }

}
