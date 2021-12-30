package com.ecommerce.commande.injector;

import com.ecommerce.commande.domain.commande.create.CommandeCreateProcess;
import com.ecommerce.commande.domain.commande.create.CommandeCreateProcessImpl;
import com.ecommerce.commande.service.facade.CommandeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainInjector {

    @Bean
    CommandeCreateProcess commandeCreateProcess(CommandeService commandeService){
        return new CommandeCreateProcessImpl(commandeService);
    }

}
