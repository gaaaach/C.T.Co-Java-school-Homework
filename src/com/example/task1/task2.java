package com.example.task1;


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base length for triangle...");
        int width = scanner.nextInt();

        int v = 1;
        if ((width%2)==0){
            v=2;
        }
        for (int n = v; n<=width; n += 2)
        {
            for (int m=0; m < (width - n / 2); m++)
            {
                System.out.print(" ");
            }
            for (int p=0; p<n; p++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
