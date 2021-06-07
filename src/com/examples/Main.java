package com.examples;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.print("Enter your height: ");
            height = myObj.nextDouble();
        while (height < 1 ) {
            System.out.print("Enter your height: ");
                height = myObj.nextDouble();
        }

        System.out.print("Enter your weight: ");
            weight = myObj.nextDouble();
        while(weight < 1) {
            System.out.print("Enter your weight ");
                weight = myObj.nextDouble();
        }

        BMI = (weight / (height * height )) * 703;

        System.out.println("Your BMI is: " + BMI);

        if (BMI <18.5)
            System.out.println("You are Underweight, You should see your doctor");
        else if (BMI > 25)
            System.out.println("You are overweight, you should see your doctor");
        else
            System.out.println("You are within ideal weight range");

    }
}
