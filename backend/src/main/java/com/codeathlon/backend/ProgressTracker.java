package com.codeathlon.backend;

import java.util.HashMap;
import java.util.Map;

public class ProgressTracker {

    // ✅ Static method
    public static Map<String, Integer> getProgress() {
        Map<String, Integer> progress = new HashMap<>();

        progress.put("Arrays", 100);
        progress.put("Strings", 0);
        progress.put("Graph", 50);
        progress.put("Dynamic Programming", 30);

        return progress;
    }
}