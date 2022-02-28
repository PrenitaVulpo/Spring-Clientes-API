package io.github.PrenitaVulpo.clientes.model.repository;

import io.github.PrenitaVulpo.clientes.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
