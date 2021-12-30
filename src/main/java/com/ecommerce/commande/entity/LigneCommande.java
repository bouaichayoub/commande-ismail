package com.ecommerce.commande.entity;

import javax.persistence.*;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refProduit;
    private String description;
    private Double quantite;
    private Double montantHt;
    @ManyToOne
    private Commande commande;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Double montantHt) {
        this.montantHt = montantHt;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public String getRefProduit() {
        return refProduit;
    }

    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }
}