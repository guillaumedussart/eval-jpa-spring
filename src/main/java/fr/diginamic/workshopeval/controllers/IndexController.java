package fr.diginamic.workshopeval.controllers;

import fr.diginamic.workshopeval.entities.Client;
import fr.diginamic.workshopeval.entities.Item;
import fr.diginamic.workshopeval.services.ClientService;
import fr.diginamic.workshopeval.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        Client client = clientService.getOneById(1L);
        Iterable<Item> items = itemService.getAllItem();
        model.addAttribute("client",client);
        model.addAttribute("items",items);
        return "home";
    }
}
