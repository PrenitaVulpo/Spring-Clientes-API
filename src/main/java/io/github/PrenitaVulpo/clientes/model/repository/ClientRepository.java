package io.github.PrenitaVulpo.clientes.model.repository;

import io.github.PrenitaVulpo.clientes.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Integer> {
}
