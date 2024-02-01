package com.example.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CalculatorController {

    @GetMapping("/calc")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam char op) {
        double result = 0;
        switch (op) {
            case '+' ->  result = num1 + num2;
            case '-' ->  result = num1 - num2;
            case '*' ->  result = num1 * num2;
            case '/' ->  result = (double) num1 / num2;
        }
        return String.format("Resultat %.2f", result);
    }

    @GetMapping("/calc2")
    public String calculate2(@RequestParam Map<String, String> parameters){
        double result = 0;
        int value1 = Integer.parseInt(parameters.get("num1"));
        int value2 = Integer.parseInt(parameters.get("num2"));
        char operator = parameters.get("op").charAt(0);
        switch (operator) {
            case '+' ->  result = value1 + value2;
            case '-' ->  result = value1 - value2;
            case '*' ->  result = value1 * value2;
            case '/' ->  result = (double) value1 / value2;
        }
        return String.format("Resultat %.2f", result);
    }
}
