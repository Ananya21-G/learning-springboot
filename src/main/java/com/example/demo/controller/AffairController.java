package com.example.demo.controller;
import com.example.demo.model.Affair;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/affair")
@CrossOrigin(origins = "http://127.0.0.1:5500/")


public class AffairController {
    private List<Affair> AffairList = new ArrayList<>();

    public AffairController(){

    }

    @GetMapping
    public List<Affair> GetData(){
        return AffairList;
    }

    @PostMapping
    public String PostData(@RequestBody Affair NewAffair){
        AffairList.add(NewAffair);
        return "Affair Created!!!";
    }


}
