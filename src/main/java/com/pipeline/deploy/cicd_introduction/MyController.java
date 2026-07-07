package com.pipeline.deploy.cicd_introduction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("products")
public class MyController  {
    @GetMapping("/product_list")
    public List<Product> getProductList()
    {
      return Arrays.asList(
              new Product(101,"Laptop",100000f),
              new Product(102,"Phone",70000f),
              new Product(103,"Watch",10000f),
              new Product(104,"Tv",89000f));
    }

}
