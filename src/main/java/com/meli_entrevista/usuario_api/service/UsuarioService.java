package com.meli_entrevista.usuario_api.service;

import com.meli_entrevista.usuario_api.exception.UsuarioNaoEncontradoException;
import com.meli_entrevista.usuario_api.model.Usuario;
import com.meli_entrevista.usuario_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario fetch(Integer id) {
        Usuario usuario = usuarioRepository.getUsuarioById(id);
        if (Objects.isNull(usuario)) {
            throw new UsuarioNaoEncontradoException();
        }
        return usuario;
    }

    public Usuario update(Integer id, Double saldoAtualizado) {
        Usuario usuarioExistente = usuarioRepository.getUsuarioById(id);
        if (Objects.isNull(usuarioExistente)) {
            throw new UsuarioNaoEncontradoException();
        }
        usuarioExistente.setSaldo(saldoAtualizado);
        return usuarioRepository.save(usuarioExistente);
    }
}
