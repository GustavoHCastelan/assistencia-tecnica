package br.fiap.assistencia_tec.controller;

import br.fiap.assistencia_tec.dto.ClienteRequest;
import br.fiap.assistencia_tec.dto.ClienteResponse;
import br.fiap.assistencia_tec.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Postman  \
            /*Acessar em casa*/
//Insomnia /

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class Controller {
    private final ClienteService service;

    @PostMapping("/salvar")
    public ClienteResponse salvar(@RequestBody ClienteRequest dto) {
        return service.salvar(dto);
    }

    @GetMapping("/pesquisar/{id}")
    public ClienteResponse pesquisar(@PathVariable Long id) {
        return service.pesquisar(id);
    }

    @GetMapping("/listar")
    public List<ClienteResponse> listar(){
        return service.listar();
    }
}
