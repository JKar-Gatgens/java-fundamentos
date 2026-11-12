package com.johan.pruebaweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola(){
        return "Hola Johan";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludo(@PathVariable String nombre){


        return "Hola " + nombre;
    }

}
