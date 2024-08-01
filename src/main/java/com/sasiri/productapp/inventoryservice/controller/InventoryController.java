package com.sasiri.productapp.inventoryservice.controller;

import com.sasiri.productapp.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<Boolean> isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        log.info("Received stock check request for skuCode: {}, quantity: {}", skuCode, quantity);
        log.info("Stock check result for skuCode: {}, quantity: {}", skuCode, quantity);
        return ResponseEntity.ok(inventoryService.isInStock(skuCode, quantity));
    }
}
