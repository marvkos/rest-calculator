package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();
    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.sum(a, b);
    }

    @RequestMapping("/div")
    public int div(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.div(a, b);
    }

    @RequestMapping("/sqr")
    public int sqr(
            @RequestParam int a
    ) {
        return calculator.sqr(a);
    }

    @RequestMapping("/pwr")
    public int pwr(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.pwr(a, b);
    }

    @RequestMapping("/abs")
    public int abs(
            @RequestParam int a
    ) {
        return calculator.abs(a);
    }
}
