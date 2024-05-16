package com.example.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class StatisticService {

    private int requestCounter = 0;

    public void incrementCounter() {
        requestCounter++;
    }

}
