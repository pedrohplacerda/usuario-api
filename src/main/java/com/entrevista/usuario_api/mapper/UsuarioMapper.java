package com.entrevista.usuario_api.mapper;

import com.entrevista.usuario_api.dto.UsuarioDTO;
import com.entrevista.usuario_api.entities.Usuario;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario toUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO toUsuarioDTO(Usuario usuario);

    @AfterMapping
    default void encodePassword(@MappingTarget Usuario usuario, UsuarioDTO usuarioDTO) {
        usuario.setSenha(new BCryptPasswordEncoder().encode(usuarioDTO.getSenha()));
    }
}
