package com.entrevista.usuario_api.repository;

import com.entrevista.usuario_api.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario getUsuarioById(Integer id);

    Usuario getUsuarioByEmail(String email);
}
