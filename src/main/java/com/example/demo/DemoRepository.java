package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String find() {
        return "TEST";
    }
}
