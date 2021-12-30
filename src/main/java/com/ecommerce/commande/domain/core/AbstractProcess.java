package com.ecommerce.commande.domain.core;

import com.ecommerce.commande.domain.commande.create.CommandeCreateProcessInput;

public interface AbstractProcess <T extends AbstractProcessInput> {
    Result exec(T input);
}
