package com.example.stockproject.repositories;

import com.example.stockproject.entities.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, String> {
}
