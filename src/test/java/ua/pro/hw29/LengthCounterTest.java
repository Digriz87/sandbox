package ua.pro.hw29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LengthCounterTest {

    private static LengthCounter lengthCounter;
    static String testString;
    static String testStringForCheckingNull;


    @BeforeAll
    private static void setup() throws InputStringFormatException {
        lengthCounter = new LengthCounter();
        testString = "Hello my dear World";
        lengthCounter.countWordsByLength(testString);

    }

    @Test
    void countLengthOfMap() {
        // given
        Integer sizeOfMap = lengthCounter.resultMap.size();
        Integer expectedSizeOfMap = 3;
        // then
        assertEquals(expectedSizeOfMap, sizeOfMap, "Map should be have size 3");
    }

    @Test
    void givenInputIsEmpty() {
        // given
        testStringForCheckingNull = "";
         // then
        assertThrows(InputStringFormatException.class, () -> lengthCounter.countWordsByLength(testStringForCheckingNull));

    }

}