package com.example.rest;

import com.example.rest.requests.ErrorResponse;
import com.example.rest.requests.StatisticResponse;
import com.example.rest.requests.TimeResponse;
import com.example.service.StatisticService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/statistics")
@RequiredArgsConstructor
public class StatisticController {
    private final StatisticService statisticService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getInfo(HttpServletRequest request, HttpServletResponse response){
        try {
            return ResponseEntity.ok(new StatisticResponse(statisticService.getRequestCounter()));

        } catch (Exception e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }

    }


}
