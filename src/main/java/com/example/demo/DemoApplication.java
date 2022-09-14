package com.example.demo;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "informatica");
        Categoria cat2 = new Categoria(null, "Escritorio");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2));

    }
}
