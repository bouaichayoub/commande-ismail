package com.ecommerce.commande.domain.commande.create;

import com.ecommerce.commande.domain.core.AbstractProcessInput;
import com.ecommerce.commande.entity.LigneCommande;

import java.util.List;

public class CommandeCreateProcessInput extends AbstractProcessInput {
    private  String ref;
    private List<LigneCommande> ligneCommandes;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

}
