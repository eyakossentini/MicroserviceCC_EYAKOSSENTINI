package com.example.stockproject.controllers;

import com.example.stockproject.entities.Stock;
import com.example.stockproject.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private IStockService iss;
    @PostMapping("/addStock")
    public Stock ajouterStock(@RequestBody Stock s){
        return iss.addStock(s);
    }

    @PostMapping("/updateStock")
    public Stock updateStock(@RequestBody Stock s){
        return iss.updateStock(s);
    }

    @GetMapping("/getStocks")
    public List<Stock> getAllStocks(){return iss.getAllStocks();}

    @DeleteMapping("/delete/{id}")
    public void deleteStockById(@PathVariable("id") String id){
        iss.deleteStockById(id);

    }

    @GetMapping("/getbyid/{id}")

    public Stock getStockById(@PathVariable("id") String id) {
        return iss.getStockById(id);


    }
}
