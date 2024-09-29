package com.pluralsight;

public class MathApplication {
    public static void main(String[] args) {

        double bobSalary = 50000.00;
        double garySalary = 55000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The Highest salary is: " + highestSalary);

        double carPrice = 25000.00;
        double truckPrice = 30000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest Price is: " + lowestPrice);

        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + areaOfCircle);

        double number = 5.0;
        double sqrtResult = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + sqrtResult);

        int x1 = 5, y1 = 10, x2 = 85, y2 =50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value is: " + absoluteValue);

        double randomValue = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomValue);

    }
}
