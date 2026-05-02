package com.codeathlon.backend;

public class UserStats {

    private int streak;

    public UserStats(int streak) {
        this.streak = streak;
    }

    public int getStreak() {
        return streak;
    }

    // ✅ Static method
    public static UserStats getStats() {
        return new UserStats(2); // your streak value
    }
}