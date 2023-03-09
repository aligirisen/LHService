package com.example.lhService.service;

import com.example.lhService.model.Lh;
import com.example.lhService.repository.LhRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LhService {

    private final LhRepository lhRepository;


    public List<Lh> getLondonHouses() {
        return lhRepository.findAll();
    }

    public Lh createLh(Lh newLh) {
        return lhRepository.save(newLh);
    }

    public Lh getLondonHousesById(String id) {
        Optional<Lh> byId = lhRepository.findById(id);
        if (byId.isEmpty()) {
            throw new RuntimeException("House not found");
        }
        return byId.get();
    }

    public void deleteLh(String id) {
        lhRepository.deleteById(id);
    }

    public void updateLh(String id, Lh newLh) {
        lhRepository.save(newLh);
    }
}