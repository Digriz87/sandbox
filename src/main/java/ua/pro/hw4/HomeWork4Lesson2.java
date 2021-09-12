package ua.pro.hw4;

public class HomeWork4Lesson2
{
    public static void main(String[] args)
    {
        int yearInput = (100);
        int finalCentury = centuryFromYear(yearInput);
        if (yearInput <= 100)
        {
            System.out.println("Это " + finalCentury + " век до нашей эры" );
        } else
            {
                System.out.println("Это " + finalCentury + " век нашей эры");
            }

    }

    static int centuryFromYear(int yearInput)
    {
        if (yearInput % 100 == 0)
        {
            yearInput = yearInput / 100;
        } else {
            yearInput = (yearInput / 100) + 1;
        }
        return yearInput;
    }
}
