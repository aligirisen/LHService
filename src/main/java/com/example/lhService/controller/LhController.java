package com.example.lhService.controller;

import com.example.lhService.model.Lh;
import com.example.lhService.service.LhService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class LhController {

    private final LhService lhService;

    @GetMapping("/londonhouses")
    public ResponseEntity<List<Lh>> getLondraHouses() {
        return new ResponseEntity<>(lhService.getLondonHouses(), HttpStatus.OK);
    }

    @PostMapping("/londonhouses")
    public ResponseEntity<Lh> createHouse(@RequestBody Lh newLh) {
        return new ResponseEntity<>(lhService.createLh(newLh), HttpStatus.CREATED);
    }

    @PutMapping("/londonhouses/{id}")
    public ResponseEntity<Lh> getLh(@PathVariable String id, @RequestBody Lh newLh) {
        /*Lh oldLh = lhService.getLondonHousesById(id);
        oldLh.setProperty_name(newLh.getProperty_name());
        oldLh.setHouse_type(newLh.getHouse_type());
        oldLh.setCity(newLh.getCity());
        oldLh.setBathroom(newLh.getBathroom());
        oldLh.setBedroom(newLh.getBedroom());
        oldLh.setReception(newLh.getReception());
        oldLh.setPrice(newLh.getPrice());
        oldLh.setPostal_code(newLh.getPostal_code());
        oldLh.setArea(newLh.getArea());
        oldLh.setLocation(newLh.getLocation());*/
        lhService.updateLh(id,newLh);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/londonhouses/{id}")
    public ResponseEntity<Void> deleteLh(@PathVariable String id) {
        lhService.deleteLh(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/londonhouses/{id}")
    public ResponseEntity<Lh> getLhById(@PathVariable String id) {
        return new ResponseEntity<>(lhService.getLondonHousesById(id),HttpStatus.OK);
    }
}

