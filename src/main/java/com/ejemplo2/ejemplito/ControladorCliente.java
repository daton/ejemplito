package com.ejemplo2.ejemplito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ControladorCliente {

    @Autowired RepositorioCliente repositorioCliente;
  @GetMapping("/cliente")
  public List<Cliente> obtenerTodos(){

    return   repositorioCliente.findAll();
  }

}
