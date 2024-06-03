package be.ipam.openbar.service;

import be.ipam.openbar.dto.QuantityDto;
import be.ipam.openbar.mapper.QuantityMapper;
import be.ipam.openbar.model.Quantity;
import be.ipam.openbar.repository.QuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class QuantityService {
    @Autowired
    private QuantityRepository quantityRepository;
    @Autowired
    private QuantityMapper quantityMapper;

    //get quantity dto by id
    public QuantityDto getQuantityById(UUID id) {
        return quantityMapper.toDto(quantityRepository.findById(id).orElseThrow());
    }

    //save quantity dto
    public QuantityDto saveQuantity(QuantityDto quantityDto) {
        return quantityMapper.toDto(quantityRepository.save(quantityMapper.toEntity(quantityDto)));
    }

    //save all quantities
    public void saveAllQuantities(Iterable<Quantity> quantity) {
        quantityRepository.saveAll(quantity);
    }

}
