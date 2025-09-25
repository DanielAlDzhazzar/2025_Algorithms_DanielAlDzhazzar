import java.util.Scanner;

public class NumbersInBetween
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input first number: ");
        int a = input.nextInt();

        System.out.println("Please input first number: ");
        int b = input.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;

        for (int i = start; i <= end; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }

}
