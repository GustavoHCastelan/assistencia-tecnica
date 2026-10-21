package br.fiap.assistencia_tec.dto;

public record ClienteRequest(
        String nome,
        String telefone,
        String email,
        String senha) {
}
