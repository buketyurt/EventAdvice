package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heat;

        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextDouble();


        if(heat > 25){
            System.out.println("You can go to swimming.");
        }
        else if(25 >= heat && heat >15){
            System.out.println("We can go to picnic.");
        }else if(15 >= heat && heat > 5){
            System.out.println("We can go to cinema.");
        }
        else
            System.out.println("We can go to skiing.");
    }
}