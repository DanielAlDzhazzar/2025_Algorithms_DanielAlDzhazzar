package Main.Ex1;

import java.util.Scanner;

public class InputLoop
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Please input an integer, to stop input -1: ");
        while(true)
        {
            num = input.nextInt();

            if(num == -1){
                break;
            }

            sum += num;

            System.out.println("Next integer: ");
            count++;
        }

        if(count > 0){
            System.out.println("Sum of " + count + " provided integers is: " + sum + " with average of " + sum / count);
        }
    }
}
