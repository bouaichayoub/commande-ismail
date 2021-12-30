package com.ecommerce.commande.webservice;

import com.ecommerce.commande.domain.commande.create.CommandeCreateProcess;
import com.ecommerce.commande.domain.commande.create.CommandeCreateProcessInput;
import com.ecommerce.commande.domain.core.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/commandes")
public class CommandeRest {

    @Autowired
    CommandeCreateProcess commandeCreateProcess;

    @PostMapping("/create")
    public Result save(@RequestBody CommandeCreateProcessInput commande) {
       return commandeCreateProcess.exec(commande);
    }
}
