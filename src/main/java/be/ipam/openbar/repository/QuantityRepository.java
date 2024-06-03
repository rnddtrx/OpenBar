package be.ipam.openbar.repository;

import be.ipam.openbar.model.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QuantityRepository extends JpaRepository<Quantity, UUID> {
}