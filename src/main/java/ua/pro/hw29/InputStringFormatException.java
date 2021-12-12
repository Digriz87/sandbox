package ua.pro.hw29;

public class InputStringFormatException extends Exception {
    public InputStringFormatException(String provided_input_is_null) {
        super(provided_input_is_null);
    }
}
