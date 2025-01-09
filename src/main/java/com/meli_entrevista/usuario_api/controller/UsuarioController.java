package com.meli_entrevista.usuario_api.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.meli_entrevista.usuario_api.model.Usuario;
import com.meli_entrevista.usuario_api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.of(Optional.ofNullable(usuarioService.save(usuario)));
    }

    @GetMapping
    public ResponseEntity<Usuario> getUsuario(@RequestParam Integer id) {
        return ResponseEntity.of(Optional.ofNullable(usuarioService.fetch(id)));
    }

}
