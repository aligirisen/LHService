package com.example.lhService.controller;

import com.example.lhService.model.Lh;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/londrahouses")
public class LhController {

    private final List<Lh> lh_list;
    public LhController(){
        Lh lh1 = new Lh("9999","Corn Street",1500000,"Duplex",450,1,4,2,"Chelsea","Londra","AXAZ");
        lh_list = Arrays.asList(lh1);
    }


    @GetMapping
    public ResponseEntity<List<Lh>> getLondraHouses() {

        return new ResponseEntity<>(lh_list, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Lh> getLh(@PathVariable String id){
        Lh result = lh_list.stream().filter(lh -> lh.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("House is not found"));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
