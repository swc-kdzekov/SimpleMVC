package com.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.Random;

@Service
public class TestService {

    private Map<String, String> countryOrigin =  Map.of("Luka","Croatia", "Marcus", "England", "Aneesh", "India");

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public Optional<String> getCountrOfOrigin(String name){
        return Optional.ofNullable(countryOrigin.get(name));
    }
}
