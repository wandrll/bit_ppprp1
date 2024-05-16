package com.example.rest.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class TimeResponse {
    Timestamp date;
}
