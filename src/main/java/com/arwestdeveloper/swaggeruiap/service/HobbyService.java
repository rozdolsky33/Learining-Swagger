package com.arwestdeveloper.swaggeruiap.service;


import com.arwestdeveloper.swaggeruiap.models.Hobby;
import com.arwestdeveloper.swaggeruiap.repository.HobbyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyService {

    @Autowired
    private HobbyRepository hobbyRepository;

    public Hobby create(Hobby hobby){
        return hobbyRepository.save(hobby);
    }

    public List<Hobby>findAll(){
        return hobbyRepository.findAll();
    }

    public Hobby findOne(Long hobbyId){
        return hobbyRepository.getOne(hobbyId);
    }

    public void delete(Long hobbyId){
        hobbyRepository.deleteById(hobbyId);

    }

}
