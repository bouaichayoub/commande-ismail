package com.ecommerce.commande.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private Double total;
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> ligneCommandes = new java.util.ArrayList<>();

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}