package ro.project.Project.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.project.Project.Api.model.entity.Client;
import ro.project.Project.Api.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
        @Autowired
        private ClientRepository clientRepository;

        // Get all clients
        @GetMapping("")
        public List<Client> getAllClients() {
            return clientRepository.findAll();
        }

        // Get a client by id
        @GetMapping("/{id}")
        public ResponseEntity<Client> getClientById(@PathVariable Long id) {
            Optional<Client> client = clientRepository.findById(id);
            if (client.isPresent()) {
                return ResponseEntity.ok(client.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        // Create a new client
        @PostMapping("/api/clients")
        public Object createClient(@RequestBody Client client) {
            return clientRepository.save(client);
        }

        // Update a client
        @PutMapping("/api/clients/{id}")
        public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
            Optional<Client> client = clientRepository.findById(id);
            if (client.isPresent()) {
                updatedClient.setId(id);
                return ResponseEntity.ok(clientRepository.save(updatedClient));
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        // Delete a client
    //    @DeleteMapping("/{id}")
      //  public ResponseEntity<?> deleteClient(@PathVariable Long id) {
        //    Optional<Client> client = clientRepository.findById(id);
          //  if (client.isPresent()) {
            //    clientRepository.delete(client.get());
              //  return ResponseEntity.noContent().build();
           // } else {
             //   return ResponseEntity.notFound().build();
           // }
        }
