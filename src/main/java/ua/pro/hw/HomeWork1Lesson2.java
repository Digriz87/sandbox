package ua.pro.hw;

public class HomeWork1Lesson2
{
    public static void main(String[] args)
    {
        int[] numbers = {-2,  77, 26, -44, 12, 13, 84, 3, -51};

        double average = 0;

        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++)
            {
                sum += numbers[j];
            }
            average = sum / numbers.length;

        }

        System.out.println(average);

    }
}
