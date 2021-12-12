package ua.pro.hw29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LengthCounterTest {

    LengthCounter lengthCounter = new LengthCounter();

    @Test
    @DisplayName("Should to calculate size of Map")
    void countLengthOfMap() throws InputStringFormatException {
        // given
        String testString="Hello my dear World";
        lengthCounter.countWordsByLength(testString);
        Integer sizeOfMap = lengthCounter.resultMap.size();
        Integer expectedSizeOfMap = 3;
        // then
        assertEquals(expectedSizeOfMap, sizeOfMap, "Map should be have size 3");
    }

    @Test
    @DisplayName("Should to showing if input is empty with exception")
    void givenInputIsEmpty() {
        // given
        String testStringForCheckingNull = "";
         // then
        assertThrows(InputStringFormatException.class, () -> lengthCounter.countWordsByLength(testStringForCheckingNull));

    }
    @Test
    @DisplayName("Should to showing if input is null with exception")
    void givenInputIsNull() {
        // given
        String testStringForCheckingNull = null;
        // then
        assertThrows(InputStringFormatException.class, () -> lengthCounter.countWordsByLength(testStringForCheckingNull));
    }

    @Test
    @DisplayName("Should to showing if getting String more then size of Map")
    void givenInputIsDigit() throws InputStringFormatException {
        lengthCounter = new LengthCounter();
        String input = "harry parry";
        Map<Integer, Set<String>> resultMap = lengthCounter.countWordsByLength(input);
        assertEquals(2, resultMap.get(5).size(), "Unexpected set size");
    }
}