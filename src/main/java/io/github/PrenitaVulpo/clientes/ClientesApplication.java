package io.github.PrenitaVulpo.clientes;


import io.github.PrenitaVulpo.clientes.model.entity.Client;
import io.github.PrenitaVulpo.clientes.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClientRepository repository){
        return args -> {
            Client client = Client.builder().cpf("12345678912").name("Ta").build();
            repository.save(client);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }


}
