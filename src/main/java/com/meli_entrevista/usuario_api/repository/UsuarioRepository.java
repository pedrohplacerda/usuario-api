package com.meli_entrevista.usuario_api.repository;

import com.meli_entrevista.usuario_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario getUsuarioById(Integer id);
}
