package br.fiap.assistencia_tec.repository;

import br.fiap.assistencia_tec.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
