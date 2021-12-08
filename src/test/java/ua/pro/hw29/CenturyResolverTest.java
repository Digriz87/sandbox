package ua.pro.hw29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CenturyResolverTest {
    private static CenturyResolver centuryResolver;
    static int inputInt;
    static int inputIntIsZero;


    @BeforeAll
    private static void setup() {
        centuryResolver = new CenturyResolver();

    }

    @Test
    @DisplayName("Should by input is zero with exception")
    void resolveCenturyInputIsZero()  {
        //given
        inputIntIsZero = 0;

        //then
        assertThrows(InputIntIsZeroException.class, () -> centuryResolver.ResolveCentury(inputIntIsZero));
    }

    @Test
    @DisplayName("Should by calculate century")
    void resolveCenturyInput() throws InputIntIsZeroException {
        //given
        inputInt = 1000;
        int resultCentury = 10;

        //then
        assertEquals(resultCentury, centuryResolver.ResolveCentury(inputInt), "Century must be 10");
    }
}