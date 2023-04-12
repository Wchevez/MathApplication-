package com.learntocode;

public class MathApp {
    public static void main(String[] args) {
        double Job1salary = 50000.0;
        double Job2salary = 60000.0;

        double largestSalary = Math.max(Job1salary, Job2salary);

        System.out.println("Largest Salary: " + largestSalary);

        double carPrice = 25000.0;
        double truckPrice = 30000.0;

        double smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("Smallest Price: " + smallestPrice);

        double radius = 7.25;
        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        double num1 = 5.0;
        double sqrt = Math.sqrt(num1);

        System.out.println("num1: " + num1);
        System.out.println("Square root of num1: " + sqrt);

        double randomNum = Math.random();
        System.out.println("The random number is" + randomNum);
    }
}