package com.sasiri.productapp.inventoryservice.repository;

import com.sasiri.productapp.inventoryservice.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
     boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String sku, Integer quantity);
}
