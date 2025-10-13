package com.recreation360.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbHealthController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/dbcheck")
    public String dbCheck() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return " Database connection successful!";
        } catch (Exception e) {
            return " Database connection failed: " + e.getMessage();
        }
    }
}

