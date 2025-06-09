package com.github.hotech.inventory.domain.model.commands;

public record UpdateProviderCommand(String name, String ruc, String email) {
    public UpdateProviderCommand{
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(ruc == null || ruc.isBlank()){
            throw new IllegalArgumentException("Ruc cannot be null or empty");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
    }
}
