package com.aos.aula1.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Autor {
    
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String nome;
    
    private Short cpf;

}
