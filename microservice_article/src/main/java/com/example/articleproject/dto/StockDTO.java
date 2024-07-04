package com.example.articleproject.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class StockDTO {
    @Id
    private String  id;
    private String zone;

    public StockDTO() {

    }

}
