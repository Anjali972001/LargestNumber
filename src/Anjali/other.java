package Anjali;

import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the numbers ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(a>b){
            max = a;
        }
        else {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("largest number is equal to "+ max);
    }
}
