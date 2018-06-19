package com.cice.apirest.web.rest;

import com.cice.apirest.service.GestionUsuariosService;
import com.cice.apirest.service.IGestionUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController("/")
//Va aceptar/pedir peticiones REST


public class UserResource {

    @Autowired
    @Qualifier("Gustavo")
    IGestionUsuarios gestionUsuarios;
    //Cada objeto que yo haya creado con @Autowired el mismo Spring buscara que bean puede usar por cada petición
    //Es decir, creara muchas menos instancias por lo que el servidor no se petara
    //Si quisieramos que lo coja de una clase en concreto usaromos @Service (el que pone) y @Qualifier (el que busca)



    //@GetMapping
    //Siempre que vamos a una URL se inicia un metodo GET
    //Si ponemos la dirección de RestController (/) + el metodo (getSaludo) saldra el resultado (http://localhost:8080/getSaludo)
    //Para el server y vuelvelo a iniciar

    //public String getSaludo(){
    //    return "Hola Spring";
    //}

    @RequestMapping(value = "saludo", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUsuarios() {
        gestionUsuarios.listaNombres();
        return new ResponseEntity<>(gestionUsuarios.listaNombres(), HttpStatus.ACCEPTED);
    }


    @RequestMapping(method = RequestMethod.POST)
    //Metodo post
    public String crearUsuario(@PathParam(value = "nombre") String nombre) {
        return "Hola " + nombre;
    }
}
