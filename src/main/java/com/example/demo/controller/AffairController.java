package com.example.demo.controller;
import com.example.demo.model.Affair;
import java.util.List;

import com.example.demo.repository.AffairRepository;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/affair")
@CrossOrigin(origins = "http://127.0.0.1:5500/")

public class AffairController {
    private final AffairRepository affairRepository;
    public AffairController(AffairRepository affairRepository){
        this.affairRepository=affairRepository;
    }

    @GetMapping
    public List<Affair> GetData(){

        return affairRepository.findAll();
    }

    @PostMapping
    public Affair PostData(@RequestBody Affair NewAffair){
        return affairRepository.save(NewAffair);
    }

    @DeleteMapping ("/{id}")
    public String DeleteData(@PathVariable Integer id){
        affairRepository.deleteById(id);
        return "Successfully Broken up";
    }
}
