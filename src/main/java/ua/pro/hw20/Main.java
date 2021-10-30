package ua.pro.hw20;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String Default = "THE TRAGEDY OF HAMLET PRINCE OF DENMARK.txt";
        InputStream inputStream;
        PrintWriter outputStream;

        Map<String,Integer> words=new HashMap<>();

        CountWords(Default,words);
        System.out.println(words);

        Set<Map.Entry<String, Integer> > entrySet
                = words.entrySet();
        ArrayList<Map.Entry<String, Integer> > listOfEntry
                = new ArrayList<>(entrySet);



        inputStream = new FileInputStream(Default);
        outputStream = new PrintWriter(new FileOutputStream("Calculation.txt"));
        outputStream.println("Analyzed file: " + Default);
        outputStream.println("word | frequency");
        for (Map.Entry<String, Integer> line: listOfEntry){
            outputStream.println(String.format("%10s | %10d", line.getKey(),line.getValue()));

        }





    }

    private static void CountWords(String s, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file=new Scanner (new File(s));

        while(file.hasNext()){
            String word=file.next().replaceAll("[^\\d\\w]+","").toLowerCase(Locale.ROOT);
            Integer count=words.get(word);
            if(count!=null)
                count++;
            else
                count=1;
            words.put(word,count);
        }
        file.close();
    }

}


