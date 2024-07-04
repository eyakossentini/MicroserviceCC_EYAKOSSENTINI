package com.example.stockproject.services;

import com.example.stockproject.entities.Stock;

import java.util.List;
import java.util.Optional;

public interface IStockService {
    Stock addStock(Stock s);
    Stock updateStock(Stock s);
    List<Stock> getAllStocks();
    Stock getStockById(String id);
    void deleteStockById(String id);
}
