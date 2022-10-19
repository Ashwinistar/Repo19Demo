package com.faspido;
import java.util.Scanner;

public class ASH_01_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The Employee");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of these numbers is:");
        System.out.println(sum);
    }
}
