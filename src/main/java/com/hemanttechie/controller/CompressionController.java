package com.hemanttechie.controller;

import com.hemanttechie.dto.Employee;
import com.hemanttechie.service.CompressionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CompressionController {

    private final CompressionService compressionService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getLargeResponse() {
        return ResponseEntity.ok(compressionService.getEmployees());
    }

}
