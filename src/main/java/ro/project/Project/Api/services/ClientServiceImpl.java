package ro.project.Project.Api.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.project.Project.Api.model.dto.ClientDTO;
import ro.project.Project.Api.model.entity.Client;
import ro.project.Project.Api.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ClientServiceImpl implements ClienteService{

    List<ClientDTO> userDTOList = new ArrayList<>();

    private final ClientRepository clientRepository;


    public ClientServiceImpl(ClientRepository clientRepository, ObjectMapper objectMapper) {
        this.clientRepository = clientRepository;
       // this.objectMapper = objectMapper;
    }
    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        ObjectMapper objectMapper = null;
        ClientDTO clientToSave = objectMapper.convertValue(clientDTO, ClientDTO.class);
        Client clientSaved = ClientRepository.save(clientToSave);
        ClientDTO clientSavedDTO = objectMapper.convertValue(clientSaved, ClientDTO.class);
        return clientSavedDTO;
    }

    @Override
    public ClientDTO updateClient(ClientDTO clientDTO) {
        return null;
    }

    @Override
    public List<ClientDTO> getAllClients() {
        return null;
    }

    @Override
    public List<ClientDTO> getClients() {
        List<Client> savedUsers = clientRepository.findAll();
        List<ClientDTO> savedClientsDTO = new ArrayList<>();
        savedUsers.forEach(user -> {
            ObjectMapper objectMapper = null;
            savedClientsDTO.add(objectMapper.convertValue(user, ClientDTO.class));
        });

        return savedClientsDTO;
    }
}
