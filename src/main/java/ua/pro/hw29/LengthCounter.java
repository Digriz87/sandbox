package ua.pro.hw29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LengthCounter {

    Map<Integer, Set<String>> resultMap;

    public Map<Integer, Set<String>> countWordsByLength(String input) throws InputStringFormatException {
        resultMap = new HashMap<>();
        if (input == null || input.isEmpty()) {
            throw new InputStringFormatException("provided input is null");
          //  return resultMap;
        }
        String[] splitInput = input.toLowerCase().split("[^a-z-]+");
        for (String fragment : splitInput) {
            Integer length = fragment.length();
            Set<String> wordsOfLength = resultMap.getOrDefault(length, new HashSet<>());
            wordsOfLength.add(fragment);
            resultMap.put(length, wordsOfLength);
        }
        return resultMap;
    }
}
