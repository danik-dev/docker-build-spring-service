package com.example.dockerbuildspringservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dockerbuildspringservice.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long>{}
