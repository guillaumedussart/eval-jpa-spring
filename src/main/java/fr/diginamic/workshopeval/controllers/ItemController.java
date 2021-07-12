package fr.diginamic.workshopeval.controllers;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.Item;
import fr.diginamic.workshopeval.services.ClientService;
import fr.diginamic.workshopeval.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;
import java.util.Set;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public String showItems(Model model){
        Client client = clientService.getOneById(1L);
        Iterable<Item> items = itemService.getAllByClient(client);
        model.addAttribute("items",items);
        return "panier";
    }

    @RequestMapping(value = "/item/add/{id}", method = RequestMethod.GET)
    public String addItemToBasket(@PathVariable Long id, Model model) {
        Client client = clientService.getOneById(1L);
        Item item = itemService.getOneById(id);

        Set<Client> clients = new HashSet<>();
        clients.add(client);
        item.setClients(clients);
        itemService.update(item);


        Iterable<Item> items = itemService.getAllItem();
        model.addAttribute("client",client);
        model.addAttribute("items",items);
        return "home";
    }
}
