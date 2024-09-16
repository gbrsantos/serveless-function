package com.example.servelessfunction.function;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UpperCase implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
