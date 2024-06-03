package be.ipam.openbar.service;

import be.ipam.openbar.dto.StepDto;
import be.ipam.openbar.mapper.StepMapper;
import be.ipam.openbar.model.Step;
import be.ipam.openbar.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StepService {
    @Autowired
    private StepRepository stepRepository;
    @Autowired
    private StepMapper stepMapper;

    //get step dto by id
    public StepDto getStepById(UUID id) {
        return stepMapper.toDto(stepRepository.findById(id).orElseThrow());
    }

    //save step dto
    public StepDto saveStep(StepDto stepDto) {
        return stepMapper.toDto(stepRepository.save(stepMapper.toEntity(stepDto)));
    }

    //save all steps
    public void saveAllSteps(List<Step> steps) {

        // iterate over the steps and set the next step to the next step in the list except for the last step
        Step[] stepArray = steps.toArray(new Step[0]);
        for (int i = 0; i < stepArray.length - 1; i++) {
            stepArray[i].setNextStep(stepArray[i + 1]);
        }
        stepRepository.saveAll(steps);
    }
}
