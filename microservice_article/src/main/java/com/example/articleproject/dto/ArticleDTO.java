package com.example.articleproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class ArticleDTO {

    @Id
    private Long id;
    private String name;

    private String id_stock;

    private double price;

    private StockDTO stockDTO;


}
