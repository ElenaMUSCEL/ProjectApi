package ro.project.Project.Api.services;

import ro.project.Project.Api.model.dto.ClientDTO;

import java.util.List;

public interface ClienteService {

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO updateClient(ClientDTO clientDTO);


    List<ClientDTO> getAllClients();

    List<ClientDTO> getClients();


}
