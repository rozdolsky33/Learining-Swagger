package com.arwestdeveloper.swaggeruiap.controller;


import com.arwestdeveloper.swaggeruiap.models.Hobby;
import com.arwestdeveloper.swaggeruiap.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping("hobby")
    public List<Hobby>findAll(){
        return hobbyService.findAll();
    }
    @GetMapping("/{hobbyId}")
    public Hobby findOne(@PathVariable("hobbyId") Long hobbyId){
        return hobbyService.findOne(hobbyId);
    }

    @PostMapping("hobby")
    public Hobby create(@RequestBody Hobby hobby){
        return hobbyService.create(hobby);
    }

    @DeleteMapping("/{hobbyId}")
    public void delete(@PathVariable ("hobbyId") Long hobbyId){
        hobbyService.delete(hobbyId);
    }


}
