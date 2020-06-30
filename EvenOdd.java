package pratiksha.garkar.pratiksha;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n, sumE = 0, sumO = 0;
        int Ecnt=0,Ocnt=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = s.nextInt();
        for(int i = 1; i <=n; i++)
        {
            if(i % 2 == 0)
            {
                sumE = sumE + i;
                Ecnt++;
                System.out.println("Even number is :"+i);
            }
            else
            {
                sumO = sumO + i;
                Ocnt++;
                System.out.println("Odd number is :"+i);
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Even number count is :"+Ecnt);
        System.out.println("Sum of Odd Numbers:"+sumO);
        System.out.println("Odd number count is :"+Ocnt);
    }
}
