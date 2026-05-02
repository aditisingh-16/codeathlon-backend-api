package com.codeathlon.backend;

import java.util.ArrayList;
import java.util.List;

public class InterviewRoundRepository {

    public static List<InterviewRound> getRoundsByCompany(String company) {

        List<InterviewRound> rounds = new ArrayList<>();

        if (company.equalsIgnoreCase("Amazon")) {
            rounds.add(new InterviewRound("Round 1", "DSA"));
            rounds.add(new InterviewRound("Round 2", "Low Level Design"));
            rounds.add(new InterviewRound("Round 3", "HR"));
        }

        else if (company.equalsIgnoreCase("Google")) {
            rounds.add(new InterviewRound("Round 1", "DSA"));
            rounds.add(new InterviewRound("Round 2", "DSA + Problem Solving"));
            rounds.add(new InterviewRound("Round 3", "System Design"));
            rounds.add(new InterviewRound("Round 4", "HR"));
        }

        else if (company.equalsIgnoreCase("Microsoft")) {
            rounds.add(new InterviewRound("Round 1", "DSA"));
            rounds.add(new InterviewRound("Round 2", "DSA + Design"));
            rounds.add(new InterviewRound("Round 3", "HR"));
        }

        else if (company.equalsIgnoreCase("Meta")) {
            rounds.add(new InterviewRound("Round 1", "DSA"));
            rounds.add(new InterviewRound("Round 2", "System Design"));
            rounds.add(new InterviewRound("Round 3", "HR"));
        }
        else if (company.equalsIgnoreCase("Walmart")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "System Design"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Wipro")) {
    rounds.add(new InterviewRound("Round 1", "Aptitude + Coding"));
    rounds.add(new InterviewRound("Round 2", "Technical Interview"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Cisco")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "Networking + System Design"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Texas Instruments")) {
    rounds.add(new InterviewRound("Round 1", "Core Subjects + DSA"));
    rounds.add(new InterviewRound("Round 2", "Technical Interview"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Flipkart")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "Machine Coding"));
    rounds.add(new InterviewRound("Round 3", "System Design"));
    rounds.add(new InterviewRound("Round 4", "HR"));
}

else if (company.equalsIgnoreCase("TCS")) {
    rounds.add(new InterviewRound("Round 1", "Aptitude"));
    rounds.add(new InterviewRound("Round 2", "Coding"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Infosys")) {
    rounds.add(new InterviewRound("Round 1", "Aptitude + Coding"));
    rounds.add(new InterviewRound("Round 2", "Technical"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

else if (company.equalsIgnoreCase("Adobe")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "DSA + Problem Solving"));
    rounds.add(new InterviewRound("Round 3", "System Design"));
}

else if (company.equalsIgnoreCase("Uber")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "Machine Coding"));
    rounds.add(new InterviewRound("Round 3", "System Design"));
}

else if (company.equalsIgnoreCase("PayPal")) {
    rounds.add(new InterviewRound("Round 1", "DSA"));
    rounds.add(new InterviewRound("Round 2", "Backend Design"));
    rounds.add(new InterviewRound("Round 3", "HR"));
}

        return rounds;
    }
}