package fr.diginamic.workshopeval.repositories;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    Iterable<Item> findAllByClients(Client client);
}
