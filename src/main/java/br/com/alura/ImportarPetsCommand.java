package br.com.alura;

import br.com.alura.client.ClientHTTPConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsCommand implements Command {
    @Override
    public void execute() {
        ClientHTTPConfiguration client = new ClientHTTPConfiguration();
        PetService petService = new PetService(client);

        try {
            petService.importarPets();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
