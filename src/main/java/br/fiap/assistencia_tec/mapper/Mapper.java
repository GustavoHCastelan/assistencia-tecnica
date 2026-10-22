package br.fiap.assistencia_tec.mapper;

import br.fiap.assistencia_tec.domain.Cliente;
import br.fiap.assistencia_tec.dto.ClienteRequest;
import br.fiap.assistencia_tec.dto.ClienteResponse;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Cliente paraEntidade(ClienteRequest dto){
        Cliente cliente = new Cliente();
        cliente.setEmail(dto.email());
        cliente.setNome(dto.nome());
        cliente.setTelefone(dto.telefone());
        cliente.setSenha(dto.senha());
        return cliente;
    }

    public ClienteResponse paraResposta (Cliente cliente){
        return new ClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEmail()
        );
    }
}
