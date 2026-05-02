package com.codeathlon.backend;

public class InterviewRound {

    private String round;
    private String type;

    public InterviewRound(String round, String type) {
        this.round = round;
        this.type = type;
    }

    public String getRound() {
        return round;
    }

    public String getType() {
        return type;
    }
}