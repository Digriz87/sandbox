package ua.pro.hw20;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, Integer> sortedMapWords = new LinkedHashMap<>();
        Map<String,Integer> nonSortedWords=new HashMap<>();

        String pathInput= "THE TRAGEDY OF HAMLET PRINCE OF DENMARK.txt";
        String pathOutput="Calc.txt";

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(pathInput));
            outputStream = new PrintWriter(new FileWriter(pathOutput));
            outputStream.println("Analyzed file: " + pathOutput);
            outputStream.println("word | frequency");
            CountWords(inputStream,nonSortedWords);
            Sorting(nonSortedWords,sortedMapWords);

            for (Map.Entry<String, Integer> line: sortedMapWords.entrySet()){
                outputStream.println(String.format("%10s | %10d", line.getKey(),line.getValue()));
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    private static void Sorting(Map<String, Integer> nonSortedWords, LinkedHashMap<String, Integer> sortedMapWords) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : nonSortedWords.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : nonSortedWords.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMapWords.put(entry.getKey(), num);
                }
            }

        }
    }

    private static void CountWords(BufferedReader inputStream, Map<String, Integer> nonSortedWords) throws FileNotFoundException {
        Scanner file=new Scanner (inputStream);
        file.next().replace(" ","");
        String whitespace_chars =  ""       /* dummy empty string for homogeneity */
                + "\\u0009" // CHARACTER TABULATION
                + "\\u000A" // LINE FEED (LF)
                + "\\u000B" // LINE TABULATION
                + "\\u000C" // FORM FEED (FF)
                + "\\u000D" // CARRIAGE RETURN (CR)
                + "\\u0020" // SPACE
                + "\\u0085" // NEXT LINE (NEL)
                + "\\u00A0" // NO-BREAK SPACE
                + "\\u1680" // OGHAM SPACE MARK
                + "\\u180E" // MONGOLIAN VOWEL SEPARATOR
                + "\\u2000" // EN QUAD
                + "\\u2001" // EM QUAD
                + "\\u2002" // EN SPACE
                + "\\u2003" // EM SPACE
                + "\\u2004" // THREE-PER-EM SPACE
                + "\\u2005" // FOUR-PER-EM SPACE
                + "\\u2006" // SIX-PER-EM SPACE
                + "\\u2007" // FIGURE SPACE
                + "\\u2008" // PUNCTUATION SPACE
                + "\\u2009" // THIN SPACE
                + "\\u200A" // HAIR SPACE
                + "\\u2028" // LINE SEPARATOR
                + "\\u2029" // PARAGRAPH SEPARATOR
                + "\\u202F" // NARROW NO-BREAK SPACE
                + "\\u205F" // MEDIUM MATHEMATICAL SPACE
                + "\\u3000" // IDEOGRAPHIC SPACE
                ;

                String pattern = "[^\\d\\w]+";
        while(file.hasNext()){
            file.next().replaceAll(whitespace_chars,"");
            String word=file.next().replaceAll(pattern,"").toLowerCase(Locale.ROOT);
            Integer count=nonSortedWords.get(word);
            if(count!=null)
                count++;
            else
                count=1;
            nonSortedWords.put(word,count);
        }
        file.close();
    }

}