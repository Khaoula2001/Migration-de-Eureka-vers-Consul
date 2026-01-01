package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    private final ClientRepository clientRepository;

    public DataInitializer(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (clientRepository.count() == 0) {
            clientRepository.save(new Client(1L, "Amine SAFI", 23f));
            clientRepository.save(new Client(2L, "Amal ALAOUI", 22f));
            clientRepository.save(new Client(3L, "Samir RAMI", 22f));
            log.info("Initialized sample clients in the database.");
        } else {
            log.info("Database already contains clients, skipping initialization.");
        }
    }
}
