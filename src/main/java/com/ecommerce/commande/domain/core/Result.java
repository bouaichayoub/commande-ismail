package com.ecommerce.commande.domain.core;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class Result {

    List<String> messageError;

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    @Value("${local.server.port}")
    String serverPort;

    public List<String> getMessageError() {
        if(messageError==null) this.messageError= new ArrayList<>();
        return messageError;
    }

    public void setMessageError(List<String> messageError) {
        this.messageError = messageError;
    }

    public boolean hasError(){
        return  !getMessageError().isEmpty();
    }

    public boolean addErrorMessage(String message){
        return  getMessageError().add(message);
    }
}
