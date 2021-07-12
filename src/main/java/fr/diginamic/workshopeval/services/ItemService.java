package fr.diginamic.workshopeval.services;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.Item;
import fr.diginamic.workshopeval.exception.ClientNotFindException;
import fr.diginamic.workshopeval.exception.ItemNotFindException;
import fr.diginamic.workshopeval.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * get all item
     *
     * @return {@link Iterable}
     * @see Iterable
     * @see Item
     */
    public Iterable<Item> getAllItem() {
        return itemRepository.findAll();
    }

    public Iterable<Item> getAllByClient(Client client){
        return itemRepository.findAllByClients(client);
    }
    /**
     * get one by id
     *
     * @param id id
     * @return {@link Item}
     * @see Item
     */
    public Item getOneById(Long id){
        return itemRepository.findById(id).orElseThrow(()->new ItemNotFindException("Pas d'article trouve"));
    }

    /**
     * create
     *
     * @param item item
     * @return {@link Item}
     * @see Item
     */
    public Item create(Item item){
        return itemRepository.save(item);
    }
    /**
     * update
     *
     * @param item item
     * @return {@link Item}
     * @see Item
     */
    public Item update(Item item){
        return itemRepository.save(item);
    }

    public Iterable<Item> deleteItems(Client client){
        return itemRepository.deleteAllByClients(client);
    }
}
