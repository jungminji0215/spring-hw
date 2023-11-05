package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public String getTest(){
        return demoRepository.find();
    }
}
