package ua.pro.hw3;

public class HomeWork3Lesson2
{
    public static void main(String[] args)
    {
        String str = "aabaa";

        if (isPalindrome(str))
        {
            System.out.print("Да");
        }
        else
            System.out.print("Нет");
    }

    static boolean isPalindrome(String str)
    {


        int i = 0, j = str.length() - 1;


        while (i < j)
        {


            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }



            i++;
            j--;
        }

        return true;
    }
}
