package com.sasiri.productapp.inventoryservice;

import org.springframework.boot.SpringApplication;

public class TestInventryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
