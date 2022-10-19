package com.faspido;
import java.util.Scanner;

public class ASH_02_Conditionals {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter the age");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

  /*
        if(age>18){
            System.out.println("Yes boy you can drive");
        }
         else{
            System.out.println("No boy you can not drive");
        }*/
        switch(age){
            case 18:
                System.out.println("Yes boy you can drive");
                break;
            case 15:
                System.out.println("No boy yiu can not driving");
                break;
            case 35:
                System.out.println("I think you are experienced");
                break;
            default:
                System.out.println("Enjoy your driving");

        }
        System.out.println("thanks for using the app");
    }
}
