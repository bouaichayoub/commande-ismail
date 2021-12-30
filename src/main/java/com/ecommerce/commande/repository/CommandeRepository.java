package com.ecommerce.commande.repository;

import com.ecommerce.commande.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>, JpaSpecificationExecutor<Commande> {

     Commande findByRef(String ref);
}