package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a + b;
    }

    @RequestMapping("/sqr")
    public int sqr(
            @RequestParam int a
    ) {
        return (int) Math.pow(a, 2);
    }

    @Request Mapping("/pwr")
    public int pwr(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return (int) Math.pow(a, b);
    }

    @RequestMapping("/abs")
    public int abs(
            @RequestParam int a
    ) {
        return Math.abs(a);
    }
}
