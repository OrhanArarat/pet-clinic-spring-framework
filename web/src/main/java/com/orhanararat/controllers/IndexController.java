package com.orhanararat.controllers;

import com.orhanararat.util.Mappings;
import com.orhanararat.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(Mappings.INDEX)
    public String index(){
        return ViewNames.INDEX;
    }

}
