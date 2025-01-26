package com.entrevista.usuario_api.controller;

import com.entrevista.usuario_api.dto.UsuarioDTO;
import com.entrevista.usuario_api.entities.Usuario;
import com.entrevista.usuario_api.mapper.UsuarioMapper;
import com.entrevista.usuario_api.model.UpdateUsuarioRequestBody;
import com.entrevista.usuario_api.service.UsuarioService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final ObjectMapper objectMapper;

    public UsuarioController(UsuarioService usuarioService, ObjectMapper objectMapper) {
        this.usuarioService = usuarioService;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> saveUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario savedUsuario = usuarioService.save(usuarioDTO);
        return ResponseEntity.of(Optional.ofNullable(UsuarioMapper.INSTANCE.toUsuarioDTO(savedUsuario)));
    }

    @GetMapping
    public ResponseEntity<UsuarioDTO> getUsuario(@RequestParam Integer id) {
        return ResponseEntity.of(Optional.ofNullable(usuarioService.fetch(id)));
    }

    @PutMapping()
    public ResponseEntity<UsuarioDTO> updateUsuario(@RequestBody String requestString) throws JsonProcessingException {
        UpdateUsuarioRequestBody requestBody = objectMapper.readValue(requestString, UpdateUsuarioRequestBody.class);
        return ResponseEntity.of(Optional.ofNullable(usuarioService.update(requestBody.getId(), requestBody.getSaldo())));
    }

}
