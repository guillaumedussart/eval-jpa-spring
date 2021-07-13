package fr.diginamic.workshopeval.services;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.exception.ClientNotFindException;
import fr.diginamic.workshopeval.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     * get one by id
     *
     * @param id id
     * @return {@link Client}
     * @see Client
     */
    public Client getOneById(Long id){
        return clientRepository.findById(id).orElseThrow(()->new ClientNotFindException("Le client n'a pas ete trouve"));
    }
}
