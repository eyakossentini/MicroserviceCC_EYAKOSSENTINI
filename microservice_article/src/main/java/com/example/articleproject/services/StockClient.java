package com.example.articleproject.services;

import com.example.articleproject.dto.StockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "stock" , url = "http://localhost:8085")
public interface StockClient {

    @GetMapping("/stock/getbyid/{id}")
    StockDTO getById(@PathVariable("id") String id);

}
