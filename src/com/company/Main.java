package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mass of water in kilograms:");

        double massOfWater = scanner.nextDouble();

        System.out.println("Enter the initial temperature:");

        double initialTemperature = scanner.nextDouble();

        System.out.println("Enter final temperature:");

        double finalTemperature = scanner.nextDouble();

        double amountOfEnergyNeeded = massOfWater * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The amount of energy needed is " + amountOfEnergyNeeded);

    }
}
