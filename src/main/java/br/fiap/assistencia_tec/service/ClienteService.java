package br.fiap.assistencia_tec.service;

import br.fiap.assistencia_tec.domain.Cliente;
import br.fiap.assistencia_tec.dto.ClienteRequest;
import br.fiap.assistencia_tec.dto.ClienteResponse;
import br.fiap.assistencia_tec.mapper.Mapper;
import br.fiap.assistencia_tec.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;
    private final Mapper mapper;

    @Transactional
    public ClienteResponse salvar(ClienteRequest request) {
        Cliente cliente = mapper.paraEntidade(request);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(clienteSalvo);
    }

    public ClienteResponse pesquisar (Long id){
        Cliente cliente = repo.findById(id).orElseThrow();
        return mapper.paraResposta(cliente);
    }

    public List<ClienteResponse> listar (){
        return repo.findAll()
                .stream()
                .map(mapper::paraResposta)
                .toList();
    }
}
