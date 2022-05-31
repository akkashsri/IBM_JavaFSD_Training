package org.example;

public class UserMainCode {
    private static final int MIN_LENGTH = 8;

    public static boolean checkSize(String password) {
        return password.length() > MIN_LENGTH;
    }

    public static boolean checkDigit(String password) {
        for(int i=0; i < password.length(); i++){
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkCase(String password) {
        String lowerCase = password.toLowerCase();
        boolean isLower = lowerCase.equals(password);
        String upperCase = password.toUpperCase();
        boolean isUpper = upperCase.equals(password);
        return !isLower && !isUpper;
    }

    public static boolean checkPassword(String password) {
        return checkSize(password) && checkDigit(password) && checkCase(password);
    }
}
