package com.codeathlon.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/workout")
    public List<Problem> getWorkout(@org.springframework.web.bind.annotation.RequestParam String company) {
        return ProblemRepository.getBalancedWorkout(company);
}
}