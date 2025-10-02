package Main;

public class Validation
{
    public static void validateArray(int[] array)
    {
        if (array == null)
        {
            throw new IllegalArgumentException("Array cannot be null");
        }
    }
}
