package com.orhanararat.controllers;

import com.orhanararat.services.map.OwnerServiceMap;
import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    // == fields ==
    private OwnerServiceMap ownerServiceMap;

    @Autowired
    public OwnerController(OwnerServiceMap ownerService) {
        this.ownerServiceMap = ownerService;
    }
    @GetMapping(Mappings.OWNERS_INDEX)
    public String index(Model model){
        model.addAllAttributes(ownerServiceMap.findAll());
        return ViewNames.OWNERS_INDEX;
    }

}
