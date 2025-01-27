package com.entrevista.usuario_api.dto;

import com.entrevista.usuario_api.enums.UserRole;

public class UsuarioDTO {
    private Integer id;
    private String nome;
    private String email;
    private String cpfCnpj;
    private Double saldo;
    private String senha;
    private UserRole role;

    public UsuarioDTO(Integer id, String nome, String email, String cpfCnpj, Double saldo, String senha, UserRole role) {
        this.cpfCnpj = cpfCnpj;
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
        this.senha = senha;
        this.role = role;
    }

    public UsuarioDTO() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
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
