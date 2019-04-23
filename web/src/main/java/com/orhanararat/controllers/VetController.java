package com.orhanararat.controllers;

import com.orhanararat.services.VetService;
import com.orhanararat.services.map.VetServiceMap;
import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    private VetServiceMap vetServiceMap;

    @Autowired
    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @GetMapping(Mappings.VETS_INDEX)
    public String index(Model model) {
//        model.addAllAttributes(vetServiceMap.findAll());
        return ViewNames.VETS_INDEX;
    }
}
