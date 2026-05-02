package com.codeathlon.backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloController {

    // 🔹 Test endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to CodeAthlon Backend 🚀";
    }

    // 🔹 Workout API (company-based)
    @GetMapping("/workout")
    public List<Problem> getWorkout(@RequestParam String company) {
        return ProblemRepository.getBalancedWorkout(company);
    }

    // 🔹 Get ALL problems (Question Bank)
    @GetMapping("/problems")
    public List<Problem> getAllProblems() {
        return ProblemRepository.getAllProblems();
    }

    // 🔹 Streak API
    @GetMapping("/streak")
    public UserStats getStreak() {
        return UserStats.getStats();
    }

    // 🔹 Progress API
    @GetMapping("/progress")
    public Object getProgress() {
        return ProgressTracker.getProgress();
    }
    @GetMapping("/interview")
    public List<InterviewRound> getInterviewRounds(@RequestParam String company) {
        return InterviewRoundRepository.getRoundsByCompany(company);
    }
}