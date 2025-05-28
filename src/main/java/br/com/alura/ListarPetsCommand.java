package br.com.alura;

import br.com.alura.client.ClientHTTPConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetsCommand implements Command {
    @Override
    public void execute() {
        ClientHTTPConfiguration client = new ClientHTTPConfiguration();
        PetService petService = new PetService(client);

        try {
            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
