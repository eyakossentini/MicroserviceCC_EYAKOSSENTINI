package com.example.stockproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "stock") // Spécifie le nom de la collection dans MongoDB
public class Stock {

    @Id // Spécifie l'identifiant de l'entité
    private String id;
    private String zone;
}

