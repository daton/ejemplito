package com.ejemplo2.ejemplito;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioCliente extends MongoRepository<Cliente, String> {
}
