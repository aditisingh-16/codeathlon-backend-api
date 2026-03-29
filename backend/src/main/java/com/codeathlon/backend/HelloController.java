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
    @GetMapping("/streak")
    public UserStats getStreak() {

        UserStats user = new UserStats();

        // simulate yesterday activity
        user.setLastSolvedDate(java.time.LocalDate.now().minusDays(1));
        user.setStreak(1);

        user.updateStreak(); // today

        return user;
    }
    @GetMapping("/progress")
    public java.util.Map<String, Integer> getProgress() {

        ProgressTracker tracker = new ProgressTracker();

        // get workout problems
        java.util.List<Problem> problems = ProblemRepository.getBalancedWorkout("Amazon");

        // add all problems
        for (Problem p : problems) {
            tracker.addProblem(p.getTopic());
        }

        // simulate solving only first problem
        if (!problems.isEmpty()) {
            tracker.markSolved(problems.get(0).getTopic());
        }

        return tracker.getProgress();
    }
}