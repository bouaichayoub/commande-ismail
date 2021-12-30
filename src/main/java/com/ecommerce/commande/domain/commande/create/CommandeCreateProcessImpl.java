package com.ecommerce.commande.domain.commande.create;

import com.ecommerce.commande.domain.core.AbstractProcessImpl;
import com.ecommerce.commande.domain.core.Result;
import com.ecommerce.commande.entity.Commande;
import com.ecommerce.commande.entity.LigneCommande;
import com.ecommerce.commande.service.facade.CommandeService;
import java.util.List;

public class CommandeCreateProcessImpl extends AbstractProcessImpl<CommandeCreateProcessInput> implements CommandeCreateProcess{

    CommandeService commandeService;

    @Override
    public void validate(CommandeCreateProcessInput input, Result result) {
        if (commandeService.exits(input.getRef())) {
           result.addErrorMessage("La reference existe");
        }
    }

    @Override
    public void run(CommandeCreateProcessInput input, Result result) {
        Commande commande = getCommande(input);
        commandeService.save(commande);
    }


    private Double calculMontantTotal(CommandeCreateProcessInput input) {
        Double total = 0D;
        if(input.getLigneCommandes()!=null){
            List<LigneCommande> ligneCommandes = input.getLigneCommandes();
            for (LigneCommande l: ligneCommandes) {
                if(l!=null){
                    l.setMontantHt(l.getQuantite()*10);
                    total += l.getMontantHt();
                }
            }
        }

        return total;

    }
    private Commande getCommande(CommandeCreateProcessInput input) {
        Double montantTotal = calculMontantTotal(input);
        Commande commande = new Commande();
        commande.setRef(input.getRef());
        commande.setTotal(montantTotal);
        return commande;
    }

    public CommandeCreateProcessImpl(CommandeService commandeService) {
        this.commandeService = commandeService;
    }
}
