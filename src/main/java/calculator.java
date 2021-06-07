/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int num_1 = Integer.valueOf(num1);
        System.out.println("What is the second number?");
        String num2 = scan.nextLine();
        int num_2 = Integer.valueOf(num2);
        cal(num_1,num_2);
    }

    public static void cal(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
