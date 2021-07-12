package fr.diginamic.workshopeval.services;

import fr.diginamic.workshopeval.entities.Item;
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

    public Iterable<Item> getAllItem() {
        return itemRepository.findAll();
    }
}
