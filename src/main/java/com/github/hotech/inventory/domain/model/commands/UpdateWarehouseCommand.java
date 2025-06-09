package com.github.hotech.inventory.domain.model.commands;

public record UpdateWarehouseCommand(Long userId) {
    public UpdateWarehouseCommand{
        if(userId == null){
            throw new IllegalArgumentException("userId can't be null");
        }
    }
}
