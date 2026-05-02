package com.codeathlon.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemRepository {
    public static List<Problem> getBalancedWorkout(String company) {
    List<Problem> companyProblems = getAllProblems();

    List<Problem> easy = new ArrayList<>();
    List<Problem> medium = new ArrayList<>();

    for (Problem p : companyProblems) {
        if (p.getCompany().equalsIgnoreCase(company)) {
            if (p.getDifficulty().equalsIgnoreCase("Easy")) {
                easy.add(p);
            } else if (p.getDifficulty().equalsIgnoreCase("Medium")) {
                medium.add(p);
            }
        }
    }

    Collections.shuffle(easy);
    Collections.shuffle(medium);

    List<Problem> workout = new ArrayList<>();

    if (!easy.isEmpty()) workout.add(easy.get(0));
    if (!medium.isEmpty()) workout.add(medium.get(0));

    return workout;
}

    public static List<Problem> getAllProblems() {
    List<Problem> problems = new ArrayList<>();

    // ARRAYS
    problems.add(new Problem(1, "Two Sum", "Arrays", "Easy", "Amazon"));
    problems.add(new Problem(2, "Best Time to Buy and Sell Stock", "Arrays", "Easy", "Google"));
    problems.add(new Problem(3, "Maximum Subarray", "Arrays", "Medium", "Microsoft"));
    problems.add(new Problem(39, "Contains Duplicate", "Arrays", "Easy", "Amazon"));
    problems.add(new Problem(40, "Product of Array Except Self", "Arrays", "Medium", "Google"));
   
    // STRINGS
    problems.add(new Problem(41, "Longest Palindromic Substring", "Strings", "Medium", "Amazon"));
    problems.add(new Problem(42, "Group Anagrams", "Strings", "Medium", "Google"));
    problems.add(new Problem(4, "Longest Substring Without Repeating Characters", "Strings", "Medium", "Amazon"));
    problems.add(new Problem(5, "Valid Anagram", "Strings", "Easy", "Meta"));
    problems.add(new Problem(6, "String to Integer (atoi)", "Strings", "Medium", "Google"));

    // LINKED LIST
    problems.add(new Problem(7, "Reverse Linked List", "Linked List", "Easy", "Google"));
    problems.add(new Problem(8, "Merge Two Sorted Lists", "Linked List", "Easy", "Amazon"));
    problems.add(new Problem(9, "Linked List Cycle", "Linked List", "Easy", "Meta"));

    // STACK
    problems.add(new Problem(10, "Valid Parentheses", "Stack", "Easy", "Amazon"));
    problems.add(new Problem(11, "Min Stack", "Stack", "Medium", "Google"));

    // QUEUE
    problems.add(new Problem(12, "Implement Queue using Stacks", "Queue", "Easy", "Microsoft"));

    // TREES
    problems.add(new Problem(43, "Lowest Common Ancestor", "Trees", "Medium", "Amazon"));
    problems.add(new Problem(44, "Diameter of Binary Tree", "Trees", "Easy", "Google"));
    problems.add(new Problem(13, "Binary Tree Inorder Traversal", "Trees", "Easy", "Amazon"));
    problems.add(new Problem(14, "Maximum Depth of Binary Tree", "Trees", "Easy", "Google"));
    problems.add(new Problem(15, "Validate Binary Search Tree", "Trees", "Medium", "Meta"));

    // GRAPHS
    problems.add(new Problem(45, "Course Schedule", "Graphs", "Medium", "Google"));
    problems.add(new Problem(46, "Clone Graph", "Graphs", "Medium", "Amazon"));
    problems.add(new Problem(16, "Word Ladder", "Graphs", "Hard", "Google"));
    problems.add(new Problem(17, "Number of Islands", "Graphs", "Medium", "Amazon"));

    // DYNAMIC PROGRAMMINGproblems.add(new Problem(47, "Coin Change", "Dynamic Programming", "Medium", "Amazon"));
    problems.add(new Problem(48, "Edit Distance", "Dynamic Programming", "Hard", "Google"));
    problems.add(new Problem(18, "Climbing Stairs", "Dynamic Programming", "Easy", "Amazon"));
    problems.add(new Problem(19, "House Robber", "Dynamic Programming", "Medium", "Google"));
    problems.add(new Problem(20, "Longest Increasing Subsequence", "Dynamic Programming", "Medium", "Microsoft"));

    // BACKTRACKING
    problems.add(new Problem(21, "Subsets", "Backtracking", "Medium", "Meta"));
    problems.add(new Problem(22, "Permutations", "Backtracking", "Medium", "Amazon"));

    // GREEDY
    problems.add(new Problem(23, "Jump Game", "Greedy", "Medium", "Google"));
    
    // HEAP / PRIORITY QUEUE
    problems.add(new Problem(49, "Kth Largest Element", "Heap", "Medium", "Amazon"));
    problems.add(new Problem(24, "Top K Frequent Elements", "Heap", "Medium", "Google"));
    problems.add(new Problem(25, "Merge K Sorted Lists", "Heap", "Hard", "Amazon"));

    // SLIDING WINDOW
    problems.add(new Problem(26, "Longest Repeating Character Replacement", "Sliding Window", "Medium", "Meta"));
    problems.add(new Problem(27, "Minimum Window Substring", "Sliding Window", "Hard", "Amazon"));

    // 🚀 NEW COMPANIES

// Walmart
problems.add(new Problem(51, "Container With Most Water", "Arrays", "Medium", "Walmart"));
problems.add(new Problem(52, "Word Search", "Backtracking", "Medium", "Walmart"));

// Wipro
problems.add(new Problem(53, "Fizz Buzz", "Math", "Easy", "Wipro"));
problems.add(new Problem(54, "Palindrome Number", "Math", "Easy", "Wipro"));

// Cisco
problems.add(new Problem(55, "Course Schedule II", "Graphs", "Medium", "Cisco"));
problems.add(new Problem(56, "Network Delay Time", "Graphs", "Medium", "Cisco"));

// Texas (Texas Instruments)
problems.add(new Problem(57, "Binary Tree Level Order Traversal", "Trees", "Medium", "Texas Instruments"));
problems.add(new Problem(58, "Path Sum", "Trees", "Easy", "Texas Instruments"));

// Flipkart
problems.add(new Problem(59, "LRU Cache", "Design", "Medium", "Flipkart"));
problems.add(new Problem(60, "Trapping Rain Water", "Arrays", "Hard", "Flipkart"));

// TCS
problems.add(new Problem(61, "Two Sum", "Arrays", "Easy", "TCS"));
problems.add(new Problem(62, "Valid Parentheses", "Stack", "Easy", "TCS"));

// Infosys
problems.add(new Problem(63, "Merge Intervals", "Arrays", "Medium", "Infosys"));
problems.add(new Problem(64, "Search Insert Position", "Binary Search", "Easy", "Infosys"));

// Adobe
problems.add(new Problem(65, "Longest Increasing Subsequence", "Dynamic Programming", "Medium", "Adobe"));
problems.add(new Problem(66, "Edit Distance", "Dynamic Programming", "Hard", "Adobe"));

// Uber
problems.add(new Problem(67, "Median of Two Sorted Arrays", "Binary Search", "Hard", "Uber"));
problems.add(new Problem(68, "Word Break", "Dynamic Programming", "Medium", "Uber"));

// PayPal
problems.add(new Problem(69, "Top K Frequent Elements", "Heap", "Medium", "PayPal"));
problems.add(new Problem(70, "Group Anagrams", "Strings", "Medium", "PayPal"));

    // BINARY SEARCH
    problems.add(new Problem(50, "Find Peak Element", "Binary Search", "Medium", "Google"));
    problems.add(new Problem(28, "Binary Search", "Binary Search", "Easy", "Google"));
    problems.add(new Problem(29, "Search in Rotated Sorted Array", "Binary Search", "Medium", "Amazon"));

    // BIT MANIPULATION
    problems.add(new Problem(30, "Single Number", "Bit Manipulation", "Easy", "Microsoft"));
    problems.add(new Problem(31, "Number of 1 Bits", "Bit Manipulation", "Easy", "Google"));

    // TRIE
    problems.add(new Problem(32, "Implement Trie", "Trie", "Medium", "Amazon"));
    problems.add(new Problem(33, "Word Search II", "Trie", "Hard", "Google"));

    // SEGMENT TREE (advanced)
    problems.add(new Problem(34, "Range Sum Query", "Segment Tree", "Medium", "Meta"));

    // MATH
    problems.add(new Problem(35, "Palindrome Number", "Math", "Easy", "Amazon"));
    problems.add(new Problem(36, "Pow(x, n)", "Math", "Medium", "Google"));

    // SYSTEM DESIGN (interview prep style)
    problems.add(new Problem(37, "Design URL Shortener", "System Design", "Medium", "Google"));
    problems.add(new Problem(38, "Design Cache System", "System Design", "Medium", "Amazon"));

    return problems;
}
}