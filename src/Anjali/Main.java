package Anjali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Largest number
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();

        int max = e;
        if(f>max){
            max = f;
        }
        if(g>max){
            max = g;
        }
        System.out.println("maximum number is " +max);
    }
}
