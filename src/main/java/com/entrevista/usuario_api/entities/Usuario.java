package com.entrevista.usuario_api.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
@Table(schema = "entrevista", name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column(name = "saldo")
    private Double saldo;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String cpfCnpj, Double saldo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
