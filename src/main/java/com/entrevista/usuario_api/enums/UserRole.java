package com.entrevista.usuario_api.enums;

public enum UserRole {
    ADMIN("ADMIN"),
    USER("USER");
    private String role;

    UserRole(String role) {
        this.role = role;
    }

    UserRole() {
    }

    public String getRole() {
        return role;
    }
}
