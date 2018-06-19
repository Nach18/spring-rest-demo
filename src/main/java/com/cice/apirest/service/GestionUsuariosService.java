package com.cice.apirest.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("Gestion")
public class GestionUsuariosService implements IGestionUsuarios {

    @Override
    public List<String> listaNombres() {
        return Arrays.asList(new String[] {"Gustavo", "Pedro", "Guardiola", "Lopetegui", "Fernando"});
    }

    @Override
    public boolean crearUsuario(String nombe) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String nombre) {
        return false;
    }

    @Override
    public String eliminarUsuario(String nombre) {
        return null;
    }
}
