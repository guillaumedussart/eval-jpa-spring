package fr.diginamic.workshopeval.controllers;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.Item;
import fr.diginamic.workshopeval.entities.TotalItem;
import fr.diginamic.workshopeval.services.ClientService;
import fr.diginamic.workshopeval.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/panier")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ClientService clientService;

    /**
     * show items
     *
     * @param model model
     * @return {@link String}
     * @see String
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String showItems(Model model){
        Client client = clientService.getOneById(1L);
        Iterable<TotalItem> items = itemService.findAllByClientsGroupByItems(client.getId());
        System.out.println(items);
        double total =0;
        for(TotalItem item:items){

            total += item.getTotalPrice();
        }
        model.addAttribute("items",items);
        model.addAttribute("price",total);
        model.addAttribute("client",client);
        return "panier";
    }

    /**
     * add item to basket
     *
     * @param id id
     * @param model model
     * @return {@link String}
     * @see String
     */
    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String addItemToBasket(@PathVariable Long id, Model model) {
        Client client = clientService.getOneById(1L);
        Item item = itemService.getOneById(id);
        System.out.println(item.getCode());
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        /*Item item1 = new Item(item.getCode(),item.getDescription(), item.getPrice(),clients);*/
        itemService.addItem(client,item);


        Iterable<Item> items = itemService.getAllItem();
        model.addAttribute("client",client);
        model.addAttribute("items",items);
        return "home";
    }
    /**
     * delete all item
     *
     * @param model model
     * @return {@link String}
     * @see String
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String deleteAllItem(Model model){
        Client client = clientService.getOneById(1L);
        itemService.deleteItems(client);
        Iterable<Item> items = itemService.getAllByClient(client);
        model.addAttribute(items);
        return "panier";
    }
}
