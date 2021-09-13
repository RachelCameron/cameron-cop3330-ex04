/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = input.nextLine();
        System.out.println("Enter a verb:");
        String verb = input.nextLine();
        System.out.println("Enter an adjective:");
        String adj = input.nextLine();
        System.out.println("Enter an adverb:");
        String adv = input.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}