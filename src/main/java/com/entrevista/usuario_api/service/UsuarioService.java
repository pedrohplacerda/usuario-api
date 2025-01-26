package com.entrevista.usuario_api.service;

import com.entrevista.usuario_api.dto.UsuarioDTO;
import com.entrevista.usuario_api.entities.Usuario;
import com.entrevista.usuario_api.exception.UsuarioNaoEncontradoException;
import com.entrevista.usuario_api.mapper.UsuarioMapper;
import com.entrevista.usuario_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario save(UsuarioDTO usuario) {
        return usuarioRepository.save(UsuarioMapper.INSTANCE.toUsuario(usuario));
    }

    public UsuarioDTO fetch(Integer id) {
        Usuario usuario = usuarioRepository.getUsuarioById(id);
        if (Objects.isNull(usuario)) {
            throw new UsuarioNaoEncontradoException();
        }
        return UsuarioMapper.INSTANCE.toUsuarioDTO(usuario);
    }

    public UsuarioDTO update(Integer id, Double saldoAtualizado) {
        Usuario usuarioExistente = usuarioRepository.getUsuarioById(id);
        if (Objects.isNull(usuarioExistente)) {
            throw new UsuarioNaoEncontradoException();
        }
        usuarioExistente.setSaldo(saldoAtualizado);
        Usuario updatedUsuario = usuarioRepository.save(usuarioExistente);
        return UsuarioMapper.INSTANCE.toUsuarioDTO(updatedUsuario);
    }
}
