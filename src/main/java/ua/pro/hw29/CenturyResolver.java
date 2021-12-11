package ua.pro.hw29;

public class CenturyResolver {

    public int ResolveCentury(int year) throws InputIntIsZeroException {

        if (year == 0) {
            throw new InputIntIsZeroException("there was no 0 year.");
        }

        if (year % 100 == 0) {
            return year / 100;
        } else {
            if (year > 0) {
                return (year / 100 ) + 1;
            } else {
                return (year / 100 ) - 1;
            }
        }
    }
}
