package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = in.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle: "+area);
    }
}
