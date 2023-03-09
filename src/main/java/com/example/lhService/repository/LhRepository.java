package com.example.lhService.repository;

import com.example.lhService.model.Lh;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface LhRepository extends MongoRepository<Lh, String>{
}
