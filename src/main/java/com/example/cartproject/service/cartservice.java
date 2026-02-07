package com.example.cartproject.service;

import com.example.cartproject.model.cartmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class cartservice {


    ArrayList<cartmodel> list=new ArrayList<>();

private  int id=0;
    public void add(cartmodel item) {
        item.setId(++id);
        item.setProductname(item.getProductname());
        item.setPrice(item.getPrice());
        item.setDescription(item.getDescription());

        list.add(item);
    }


    public ArrayList<cartmodel> getall() {
    return list;
    }

    public cartmodel getid(int k) {
        for(cartmodel x:list){
            if(k == x.getId()){

                return x;
            }
        } throw new RuntimeException("Product not found");
    }
}
