package com.example.stockproject.services;

import com.example.stockproject.entities.Stock;
import com.example.stockproject.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService implements IStockService{

    @Autowired
    private StockRepository sr;


    @Override
    public Stock addStock(Stock s) {
        sr.save(s);
        return s;    }

    @Override
    public Stock updateStock(Stock s) {
        return sr.save(s);
    }

    @Override
    public List<Stock> getAllStocks() {
        return sr.findAll();
    }

    @Override
    public Stock getStockById(String id) {
        return sr.findById(id).get();
    }


    @Override
    public void deleteStockById(String id) {
        sr.deleteById(id);


    }

}
