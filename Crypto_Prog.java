package pratiksha.garkar.pratiksha;

import java.util.Scanner;

public class Crypto_Prog {
    public static void main(String[] args) {
        char a;
        int i,b=1;
        Scanner s=new Scanner(System.in);
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int arr1[];
        arr1=new int[26];
        for(i=0;i<26;i++)
        {
            arr1[i]=b;
            b++;
        }
        System.out.println("Enter one alphabet :");
        a=s.next().charAt(0);
        for(i=0;i<26;i++)
        {
            if (a == arr[i])
            {
                System.out.println("Value of a is "+arr1[i]);
            }
        }
    }
}
