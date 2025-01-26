package com.entrevista.usuario_api.mapper;

import com.entrevista.usuario_api.dto.UsuarioDTO;
import com.entrevista.usuario_api.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario toUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO toUsuarioDTO(Usuario usuario);
}
