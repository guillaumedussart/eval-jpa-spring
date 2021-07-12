package fr.diginamic.workshopeval.repositories;

import fr.diginamic.workshopeval.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
}
