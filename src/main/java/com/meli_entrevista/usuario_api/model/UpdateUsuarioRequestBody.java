package com.meli_entrevista.usuario_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;


public class UpdateUsuarioRequestBody {

    public UpdateUsuarioRequestBody(Integer id, String email, Double saldo) {
        this.id = id;
        this.email = email;
        this.saldo = saldo;
    }

    public UpdateUsuarioRequestBody() {
    }

    @JsonProperty
    private Integer id;

    @JsonProperty
    @Nullable
    private String email;

    @JsonProperty
    private Double saldo;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
