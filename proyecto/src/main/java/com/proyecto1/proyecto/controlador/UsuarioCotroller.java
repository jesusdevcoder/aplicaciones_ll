package com.proyecto1.proyecto.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.proyecto.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UsuarioCotroller {

     private List<Usuario> usuarios= new ArrayList<>(
        Arrays.asList(new Usuario( 1234, "jesus", "pulido"))
     );


     @GetMapping("/usuarios")
      public List<Usuario> getUsuarios() {
         return usuarios;
     }


     @PostMapping("/usuario")
     public Usuario postUsuario(@RequestBody Usuario usuario) {
         usuarios.add(usuario);
         
         return usuario;
     }
     
     







   }



