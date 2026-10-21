package br.fiap.assistencia_tec.service;

import br.fiap.assistencia_tec.domain.Cliente;
import br.fiap.assistencia_tec.dto.ClienteRequest;
import br.fiap.assistencia_tec.dto.ClienteResponse;
import br.fiap.assistencia_tec.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteResponse salvar(ClienteRequest request) {
        Cliente cliente = mapper.paraEntidade(request);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(clienteSalvo);
    }
}
