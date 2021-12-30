package com.ecommerce.commande.service.impl;

import com.ecommerce.commande.entity.Commande;
import com.ecommerce.commande.repository.CommandeRepository;
import com.ecommerce.commande.service.facade.CommandeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeServiceImpl implements CommandeService {

    Logger logger= LoggerFactory.getLogger(CommandeService.class);

    @Autowired
    CommandeRepository commandeRepository;

    @Override
    public String save(Commande commande) {
        logger.info("Save Commmande Called");
        Commande savedCommande = commandeRepository.save(commande);
        if (savedCommande == null) {
            throw new IllegalStateException("Une erreur a eu lieu lors de l'enregistrement de la commande");
        }
        return savedCommande.getRef();
    }

    @Override
    public boolean exits(String ref) {
        logger.info("Exists Ref Called");
        Commande commande = commandeRepository.findByRef(ref);
        return  commande != null && commande.getId() != null;
    }
}
