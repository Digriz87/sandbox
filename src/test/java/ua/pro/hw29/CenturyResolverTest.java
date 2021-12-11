package ua.pro.hw29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyResolverTest {
    private static CenturyResolver centuryResolver = new CenturyResolver();

    @Test
    @DisplayName("Should throw an exception if input equals to zero")
    void resolveCenturyInputIsZero() {
        //given
        int inputIntIsZero = 0;

        //then
        assertThrows(InputIntIsZeroException.class, () -> centuryResolver.ResolveCentury(inputIntIsZero));
    }
    @Test
    @DisplayName("Should to showing if input is not null")
    void resolveCenturyInputIsNotNull() throws InputIntIsZeroException {
        //given
        
        int inputInt = 2000;
        //then
        assertNotNull(centuryResolver.ResolveCentury(inputInt),"Input is Not Null");
    }

    @Test
    @DisplayName("Should to showing if input is null with exception")
    void resolveCenturyInputIsIsNull() throws NullPointerException {
        //given
        Integer inputIsNull = null;
        //then

        assertThrows(NullPointerException.class, () -> centuryResolver.ResolveCentury(inputIsNull), "Exception Handler" );
    }

    @Test
    @DisplayName("Should calculate century by year")
    void resolveCenturyInput() throws InputIntIsZeroException {
        //given
        int inputInt = 1000;
        int resultCentury = 10;
        //then
        assertEquals(resultCentury, centuryResolver.ResolveCentury(inputInt), "Century must be 10");
    }

    @Test
    @DisplayName("Should calculate century by year with input digit with minus")
    void resolveCenturyInputIsMinus() throws InputIntIsZeroException {
        //given
        int inputInt = -2000;

        //then
        assertTrue(centuryResolver.ResolveCentury(inputInt) < 0);
    }
}