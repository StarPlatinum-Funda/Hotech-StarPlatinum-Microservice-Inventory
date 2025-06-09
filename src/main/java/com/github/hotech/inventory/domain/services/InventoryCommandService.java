package com.github.hotech.inventory.domain.services;

import com.github.hotech.inventory.domain.model.aggregates.Inventory;
import com.github.hotech.inventory.domain.model.aggregates.Warehouse;
import com.github.hotech.inventory.domain.model.aggregates.Provider;
import com.github.hotech.inventory.domain.model.commands.*;

import java.util.Optional;

public interface InventoryCommandService {
    Optional<Inventory> handle(CreateItemsCommand command);
    Optional<Inventory> handle(UpdateInventoryCommand command);
    void handle(DeleteItemsCommand command);

    Optional<Warehouse> handle(CreateWarehouseCommand command);
    Optional<Warehouse> handle(UpdateWarehouseCommand command);

    Optional<Provider> handle(CreateProviderCommand command);
    Optional<Provider> handle(UpdateProviderCommand command);
}
