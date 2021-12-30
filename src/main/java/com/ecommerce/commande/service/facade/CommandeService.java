package com.ecommerce.commande.service.facade;

import com.ecommerce.commande.entity.Commande;

public interface CommandeService {
    String save(Commande commande);
    boolean exits(String ref);
}
