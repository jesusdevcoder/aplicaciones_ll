package com.proyecto1.proyecto.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping ("/saludos")

public class Saludocontrolador {
    @GetMapping("/hola")
    public String saludo(){
        return"buenos dias";
    }

    @GetMapping("/chao")  
    public String miEndpoint() {  
        return "hasta luego";  
    }  

    

    }
    





