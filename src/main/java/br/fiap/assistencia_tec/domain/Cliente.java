package br.fiap.assistencia_tec.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JAVA_CLIENTE")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 120)
    private String nome;

    @Column(name = "TELEFONE", length = 220)
    private String telefone;

    @Column(name = "EMAIL", length = 120, unique = true)
    private String email;

    @Column(name = "SENHA", length = 512)
    private String senha;
}
