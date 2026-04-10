package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double Bob = 76000;
        double Gary = 83000;
        double highestSalary = Math.max(Bob, Gary);
        if (highestSalary == Bob) {
            System.out.printf("Bob has the highest salary of : $%.2f%n%n", highestSalary);

    }
        else {
        System.out.printf("Gary has the highest salary of : $%.2f%n%n", highestSalary);
    }


    double carPrice = 49000;
    double truckPrice = 64000;
    double smallestPrice = Math.min(carPrice, truckPrice);
        if (smallestPrice == carPrice) {
        System.out.printf("A car has the smaller price of : $%.2f%n%n", smallestPrice);
    }
        else {
        System.out.printf("A truck has the smaller price of : $%.2f%n%n", smallestPrice);
    }

    double radius = 7.25;
    double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of circle is %.2f%n%n", areaCircle);


    double num14 = 5.0;
    double squareRoot =  Math.sqrt(num14);
        System.out.printf("The square root of %.1f is %.2f%n%n", num14, squareRoot);


    int point1X = 5;
    int point1Y = 10;

    int point2X = 85;
    int point2Y = 50;

    int pointXDistance = point2X - point1X;
    int pointYDistance = point2Y - point1Y;

        System.out.printf("The distance between (%d, %d) and (%d, %d) is (%d, %d)%n%n", point1X, point1Y, point2X, point2Y, pointXDistance, pointYDistance);


    double num16 = -3.8;
    double absoluteNum16 = Math.abs(num16);
        System.out.printf("The absolute value of %.1f is %.1f%n%n", num16, absoluteNum16);
    double randomNumber = Math.random();
        System.out.printf("The random number is %.2f%n%n", randomNumber);

    int days = 24;
    int hoursInDay = 24;
    int minutesInHour = 60;
    int secondsInMinute = 60;
    int milisecondsInSecond = 1000;
    int minutesin24Days = minutesInHour * hoursInDay * days;
    int milisecondsin24Days = milisecondsInSecond * secondsInMinute * minutesInHour * hoursInDay * days;
        System.out.printf("There are %d minutes in %d days ", minutesin24Days, days);
        System.out.printf("There are %d miliseconds in %d days ", milisecondsin24Days, days);
}


    }


