package com.example.emlak_burada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmlakBuradaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmlakBuradaApplication.class, args);
    }

}
