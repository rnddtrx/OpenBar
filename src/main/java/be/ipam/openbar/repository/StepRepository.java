package be.ipam.openbar.repository;

import be.ipam.openbar.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StepRepository extends JpaRepository<Step, UUID> {
}