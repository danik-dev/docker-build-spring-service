package com.example.dockerbuildspringservice.repo;

import org.springframework.stereotype.Service;

import com.example.dockerbuildspringservice.entity.Person;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo personRepo;
    
    @PostConstruct
    public void init(){
        // personRepo.save(new Person((long) 1, "ivan"));
    }
}
