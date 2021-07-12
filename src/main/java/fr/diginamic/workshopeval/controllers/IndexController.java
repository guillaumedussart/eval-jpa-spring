package fr.diginamic.workshopeval.controllers;

import fr.diginamic.workshopeval.services.ClientService;
import fr.diginamic.workshopeval.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "home";
    }
}
