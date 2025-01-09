package com.meli_entrevista.usuario_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(schema = "entrevista", name = "tb_usuario")
public class Usuario {

    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "nome")
    private String nome;

    @JsonProperty
    @Column(name = "email")
    private String email;

    @JsonProperty
    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @JsonProperty
    @Column(name = "saldo")
    private Double saldo;
}
