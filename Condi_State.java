package pratiksha.garkar.pratiksha;

import java.util.Scanner;

public class Condi_State
{
    public static void main(String[] args)
    {
        int fact1=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want");
        int count;
        count = scan.nextInt();
        switch (count)
        {
            case 0:
                System.out.println("Factorial =1");
                System.out.println("Enter how many elements you want");
                count = scan.nextInt();
                switch (count)
                {
                    case 0:
                        System.out.println("Factorial =1");
                        break;

                    case 3:
                        for (int i = 1; i <= count; i++)
                        {
                            fact1 = fact1 * i;

                        }
                        System.out.println("factorial is" + fact1);
                        break;
                    case 4:
                        for (int i = 1; i <= count; i++)
                        {
                            fact1 = fact1 * i;

                        }
                        System.out.println("factorial is" + fact1);
                        break;
                    case 5:
                        for (int i = 1; i <= count; i++)
                        {
                            fact1 = fact1 * i;

                        }
                        System.out.println("factorial is" + fact1);
                        break;
                    case 6:
                        for (int i = 1; i <= count; i++)
                        {
                            fact1 = fact1 * i;

                        }
                        System.out.println("factorial is" + fact1);
                        break;

                }
                break;

            case 4:
                for (int i = 1; i <= count; i++)
                {
                    fact1 = fact1 * i;

                }
                System.out.println("factorial is" + fact1);
                break;
            case 5:
                for (int i = 1; i <= count; i++)
                {
                    fact1 = fact1 * i;

                }
                System.out.println("factorial is" + fact1);
                break;

        }



    }
}

