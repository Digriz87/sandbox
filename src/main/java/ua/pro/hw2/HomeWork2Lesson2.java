package ua.pro.hw2;



public class HomeWork2Lesson2
{



    public static void main(String[] args)
    {
        String inputStr = "lol ok an kek o";
        String[] str = inputStr.split(" ");

        int maxSize = 0;

        for(String s: str)
            if(maxSize < s.length())
                maxSize = s.length();

        int[] lCount = new int[maxSize+1];


        for(String s1: str)
        {
            lCount[s1.length()]++;
        }

        for(int j=1; j<lCount.length;j++)
        {
            System.out.println("Мы имеем стрингов: "+lCount[j] + " с длиной: " + j);
        }

    }


}
