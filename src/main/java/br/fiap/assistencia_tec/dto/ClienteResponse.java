package br.fiap.assistencia_tec.dto;

public record ClienteResponse(
        Long id,
        String nome,
        String telefone,
        String email) {
}
