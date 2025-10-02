package Main.Ex2.utils;

public class NumberUtils {
    public static int getPos(int[] array, int num)
    {
        int pos = -1;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == num){
                pos = i;
                break;
            }
        }

        if (pos != -1)
        {
            return pos;
        }

        else
        {
            System.out.println("Number not found");
            return -1;
        }
    }

    public static void main(String[] args)
    {
        int num = 10;
        int[] arrayI = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 20, 25};

        System.out.println("First position of number 10: " + getPos(arrayI, num));

    }
}
