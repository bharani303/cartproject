package com.example.cartproject.controller;

import com.example.cartproject.model.cartmodel;
import com.example.cartproject.service.cartservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*")
@RestController
public class cartcontroller {
    @Autowired
    cartservice cartservice;

    @PostMapping("/add")
    String adding(@RequestBody cartmodel products){

        cartservice.add(products);
        return "add succesfully";
     }

      @GetMapping("/productid/{id}")
     public ResponseEntity<cartmodel> getById(@PathVariable int id) {
         try {
             return ResponseEntity.ok(cartservice.getid(id));
         } catch (RuntimeException e) {
             return ResponseEntity.notFound().build();
         }
     }

    @GetMapping("/product/all")
    ArrayList<cartmodel> getting(){
       return cartservice.getall();
    }

}
