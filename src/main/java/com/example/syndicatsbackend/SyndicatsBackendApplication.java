package com.example.syndicatsbackend;

import com.example.syndicatsbackend.entities.*;
import com.example.syndicatsbackend.enums.natureDepenses;
import com.example.syndicatsbackend.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class SyndicatsBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(SyndicatsBackendApplication.class, args);


    }
}
