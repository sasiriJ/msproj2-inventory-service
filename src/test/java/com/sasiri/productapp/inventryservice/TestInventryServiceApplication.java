package com.sasiri.productapp.inventryservice;

import org.springframework.boot.SpringApplication;

public class TestInventryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(InventryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
