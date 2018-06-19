package com.cice.apirest.service;

import java.util.List;

public interface IGestionUsuarios {

    //Usamos la interfaz como polimorfismo

    List<String> listaNombres();

    //Da la lista de nombre

    boolean crearUsuario(String nombe);

    //Crear un nuevo recurso en la base de datos

    boolean actualizarUsuario(String nombre);

    //Actualiza la base de datos

    String eliminarUsuario(String nombre);

    //Y elimina
}
