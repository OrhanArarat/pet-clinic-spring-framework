package com.orhanararat.controllers;

import com.orhanararat.model.Vet;
import com.orhanararat.services.VetService;
import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping(Mappings.VETS_INDEX)
    public String index(Model model) {
        List<Vet> vets = new ArrayList<>(vetService.findAll());

        Collections.sort(vets,(o1, o2) -> o1.getId().compareTo(o2.getId()));

        model.addAttribute("vets",vets);

        return ViewNames.VETS_INDEX;
    }
}
