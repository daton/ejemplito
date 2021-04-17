package com.ejemplo2.ejemplito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemplitoApplication implements CommandLineRunner {

@Autowired RepositorioCliente repositorioCliente;

	public static void main(String[] args) {
		SpringApplication.run(EjemplitoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Vamos a probar que se guarde un objeto en la base de datos
		Cliente cliente=new Cliente("dos", "Ana", "ana@gmail.com");
		repositorioCliente.save(cliente);
		System.out.println("Cliente guardado con exito");

	}
}
