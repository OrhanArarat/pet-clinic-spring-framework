package com.orhanararat.controllers;

import com.orhanararat.services.OwnerService;
import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    // == fields ==
    private OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @GetMapping(Mappings.OWNERS_INDEX)
    public String index(Model model){
        model.addAllAttributes(ownerService.findAll());
        return ViewNames.OWNERS_INDEX;
    }

}
