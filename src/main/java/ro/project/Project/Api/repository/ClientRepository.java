package ro.project.Project.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.project.Project.Api.model.dto.ClientDTO;
import ro.project.Project.Api.model.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    static Client save(ClientDTO clientToSave) {
        return null;
    }
}
