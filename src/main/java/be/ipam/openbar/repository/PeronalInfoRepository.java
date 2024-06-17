package be.ipam.openbar.repository;

import be.ipam.openbar.model.PeronalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PeronalInfoRepository extends JpaRepository<PeronalInfo, UUID> {
}