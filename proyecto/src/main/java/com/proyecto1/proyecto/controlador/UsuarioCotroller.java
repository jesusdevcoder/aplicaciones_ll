package com.proyecto1.proyecto.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.proyecto1.proyecto.models.Usuario;

@RestController
public class UsuarioCotroller {

    private List<Usuario> usuarios = new ArrayList<>(Arrays.asList(new Usuario(1234, "Jesus", "Pulido")));

    // Obtener todos los usuarios
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Crear un nuevo usuario
    @PostMapping("/usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    // Actualizar un usuario existente
    @PutMapping("/usuario")
    public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getIdCLi() == usuario.getIdCLi()) {
                u.setNombre(usuario.getNombre());
                u.setApellidos(usuario.getApellidos());
                return u;
            }
        }
        return null;
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/usuario/{IdCli}")
    public ResponseEntity<String> deleteUsuario(@PathVariable int IdCli) {
        for (Usuario u : usuarios) {
            if (u.getIdCLi() == IdCli) {
                usuarios.remove(u);
                return ResponseEntity.ok("Usuario eliminado"); // Respuesta exitosa
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
    }
}
