package com.orhanararat.controllers;

import com.orhanararat.model.Owner;
import com.orhanararat.services.OwnerService;
import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Controller
public class OwnerController {

    // == fields ==
    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @GetMapping(Mappings.OWNERS_INDEX)
    public String index(Model model){
        Set<Owner> ownerSet = ownerService.findAll();
        List<Owner> owners = new ArrayList<>(ownerSet);
        Collections.sort(owners,(o1, o2) -> o1.getId().compareTo(o2.getId()));
        model.addAttribute("owners",owners);
        return ViewNames.OWNERS_INDEX;
    }

}
