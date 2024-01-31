package App.utils;

import java.text.DecimalFormat;

public class Utils {

    public static String roundValue(double value) {

        return new DecimalFormat("0.00").format(value);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double checkNumberDouble(String inputText) {
        try {
            return Double.parseDouble(inputText.trim());
        } catch (NumberFormatException e) {
            return -1;//ввели не число
        }
    }

    public static int checkNumberInt(String inputText) {
        try {
            return Integer.parseInt(inputText.trim());
        } catch (NumberFormatException e) {
            return -1;//ввели не число
        }
    }
}
